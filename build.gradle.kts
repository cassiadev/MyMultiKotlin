buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20")
        classpath("com.android.tools.build:gradle:7.0.0")
    }
}
group = "com.example.mymultikotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
