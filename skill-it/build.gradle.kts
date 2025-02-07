// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0") // Android Gradle Plugin
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0") // Kotlin Plugin
        classpath("com.google.gms:google-services:4.3.15") // Firebase
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}