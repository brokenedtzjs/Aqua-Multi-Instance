plugins {
    kotlin("jvm") version "1.9.22"
}

group = "com.github.arcticaquila.aquamultiinstance"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}