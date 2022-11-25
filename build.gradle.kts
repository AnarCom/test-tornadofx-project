import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    application
    id("org.openjfx.javafxplugin") version "0.0.13"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots")
    }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("no.tornado:tornadofx:2.0.0-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"//JavaVersion.VERSION_11.toString()
}

application {
    mainClass.set("MainKt")
}

javafx {
    version = "11.0.2"
    modules = listOf(
        "javafx.controls",
        "javafx.fxml",
        "javafx.base",
        "javafx.fxml",
        "javafx.media",
        "javafx.swing",
        "javafx.web",
        "javafx.graphics"
    )
}
