plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

kotlin {
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64() // For iOS simulator support

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib")
                implementation("io.ktor:ktor-client-core:2.0.0") // Example: Ktor for networking
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0") // Example: Coroutines
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("com.google.ar:core:1.34.0") // ARCore dependency
            }
        }
        val iosMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-ios:2.0.0") // Example: iOS-specific Ktor client
            }
        }
    }
}

android {
    compileSdkVersion(31)
   
