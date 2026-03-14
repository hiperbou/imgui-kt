import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.`maven-publish`
import org.gradle.kotlin.dsl.signing
import java.util.*

plugins {
    `maven-publish`
    signing
}

// Stub secrets to let the project sync and build without the publication values set up
ext["signing.keyId"] = null
ext["signing.password"] = null
ext["signing.secretKeyRingFile"] = null
ext["ossrhUsername"] = null
ext["ossrhPassword"] = null
ext["developer.id"] = null
ext["developer.name"] = null
ext["developer.email"] = null

// Grabbing secrets from local.properties file or from environment variables, which could be used on CI
val secretPropsFile = project.rootProject.file("local.properties")
if (secretPropsFile.exists()) {
    secretPropsFile.reader().use {
        Properties().apply {
            load(it)
        }
    }.onEach { (name, value) ->
        ext[name.toString()] = value
    }
} else {
    ext["signing.keyId"] = System.getenv("SIGNING_KEY_ID")
    ext["signing.password"] = System.getenv("SIGNING_PASSWORD")
    ext["signing.secretKeyRingFile"] = System.getenv("SIGNING_SECRET_KEY_RING_FILE")
    ext["ossrhUsername"] = System.getenv("OSSRH_USERNAME")
    ext["ossrhPassword"] = System.getenv("OSSRH_PASSWORD")
    ext["developer.id"] = System.getenv("DEVELOPER_ID")
    ext["developer.name"] = System.getenv("DEVELOPER_NAME")
    ext["developer.email"] = System.getenv("DEVELOPER_EMAIL")
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

fun getExtraString(name: String) = ext[name]?.toString()

publishing {
    // Configure maven central repository
    repositories {
        maven {
            name = "ossrh-staging-api"
            setUrl("https://ossrh-staging-api.central.sonatype.com/service/local/staging/deploy/maven2/")
            //setUrl("https://ossrh-staging-api.central.sonatype.com/content/repositories/snapshots/")
            credentials {
                username = getExtraString("ossrhUsername")
                password = getExtraString("ossrhPassword")
            }
        }
    }

    // Configure all publications
    publications.withType<MavenPublication> {
        // Stub javadoc.jar artifact
        artifact(javadocJar.get())

        // Provide artifacts information requited by Maven Central
        pom {
            name.set("imgui-kt")
            description.set("Kotlin definitions for imgui-kt")
            url.set("https://github.com/hiperbou/imgui-kt")

            licenses {
                license {
                    name.set("MIT")
                    url.set("https://opensource.org/licenses/MIT")
                }
            }
            developers {
                developer {
                    id.set(getExtraString("developer.id"))
                    name.set(getExtraString("developer.name"))
                    email.set(getExtraString("developer.email"))
                }
            }
            scm {
                connection.set("scm:git:git://github.com/hiperbou/imgui-kt.git")
                developerConnection.set("scm:git:ssh://github.com:hiperbou/imgui-kt.git")
                url.set("https://github.com/hiperbou/imgui-kt")
            }
        }
    }
}

// Signing artifacts. Signing.* extra properties values will be used
signing {
    sign(publishing.publications)
}

// Task to ensure deployment visibility in Central Publisher Portal
// This calls the manual upload API endpoint as required by the OSSRH Staging API migration docs
tasks.register("uploadToCentralPortal") {
    group = "publishing"
    description = "Upload staged artifacts to Central Publisher Portal for visibility"
    
    doLast {
        val namespace = project.group.toString()
        val username = getExtraString("ossrhUsername")
        val password = getExtraString("ossrhPassword")
        
        if (username.isNullOrEmpty() || password.isNullOrEmpty()) {
            throw GradleException("ossrhUsername and ossrhPassword must be set for Central Portal upload")
        }
        
        // Encode credentials as Base64 for Bearer token
        val credentials = "$username:$password"
        val encodedCredentials = java.util.Base64.getEncoder().encodeToString(credentials.toByteArray())
        
        val url = "https://ossrh-staging-api.central.sonatype.com/manual/upload/defaultRepository/$namespace"
        
        logger.lifecycle("Uploading deployment to Central Publisher Portal...")
        logger.lifecycle("Namespace: $namespace")
        logger.lifecycle("Endpoint: $url")
        
        try {
            val connection = java.net.URL(url).openConnection() as java.net.HttpURLConnection
            connection.requestMethod = "POST"
            connection.setRequestProperty("Authorization", "Bearer $encodedCredentials")
            connection.setRequestProperty("Content-Type", "application/json")
            connection.doOutput = true
            
            // Optional: set publishing_type parameter (default is user_managed)
            val requestBody = """{"publishing_type": "user_managed"}"""
            connection.outputStream.use { os ->
                os.write(requestBody.toByteArray())
            }
            
            val responseCode = connection.responseCode
            val responseMessage = connection.responseMessage
            
            if (responseCode == 200 || responseCode == 201) {
                logger.lifecycle("✅ Successfully uploaded to Central Publisher Portal!")
                logger.lifecycle("Response: $responseCode $responseMessage")
                logger.lifecycle("Check your deployments at: https://central.sonatype.com/publishing/deployments")
            } else {
                val errorStream = connection.errorStream
                val errorMessage = if (errorStream != null) {
                    errorStream.bufferedReader().use { it.readText() }
                } else {
                    responseMessage
                }
                throw GradleException("Failed to upload to Central Portal: $responseCode $responseMessage\nError: $errorMessage")
            }
        } catch (e: Exception) {
            throw GradleException("Error calling Central Portal API: ${e.message}", e)
        }
    }
}