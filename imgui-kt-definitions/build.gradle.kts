plugins {
    kotlin("multiplatform") version "1.8.22"
    id("convention.publication")
}

group = "io.github.hiperbou.imgui-kt"
version = "0.0.3"

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        browser {
        }
    }
    sourceSets {
        val jsMain by getting
    }
}
