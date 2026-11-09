rootProject.name = "Odin"
pluginManagement {

    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.fabricmc.net/")
        maven("https://jitpack.io")
    }

    val loom_version = providers.gradleProperty("loom_version").get()
    val kotlin_version = providers.gradleProperty("kotlin_version").get()

    plugins {
        id("net.fabricmc.fabric-loom") version loom_version
        kotlin("jvm") version kotlin_version
        kotlin("plugin.compose") version kotlin_version
    }
}
