/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.10/samples
 */
 plugins {
    id 'com.android.application'
    id 'kotlin-android'
}

android {
    compileSdkVersion 31
    defaultConfig {
        applicationId "com.example.arcrossplatformapp"
        minSdkVersion 24
        targetSdkVersion 31
        versionCode 1
        versionName "1.0"
    }
}

dependencies {
    implementation "com.google.ar:core:1.34.0"  // Latest ARCore version
    implementation "org.jetbrains.kotlin:kotlin-stdlib:1.8.0"  // Latest Kotlin version
}

