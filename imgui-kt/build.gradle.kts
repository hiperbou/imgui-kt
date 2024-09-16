plugins {
    kotlin("multiplatform") version "1.7.10"
    id("convention.publication")
}

group = "io.github.hiperbou.imgui-kt"
version = "0.0.1"

repositories {
    mavenLocal()
    mavenCentral()
}

kotlin {
    js(LEGACY) {
        browser {
        }
    }
    sourceSets {
        val jsMain by getting

        jsMain.dependencies {
            implementation("io.github.hiperbou.imgui-kt:imgui-kt-definitions:0.0.2")
        }
    }

}
