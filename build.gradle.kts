val kotlinVersion = "1.3.60"
val jUnitVersion = "5.5.2"
val hamcrestVersion = "2.2"


plugins {
    kotlin("jvm") version "1.3.61" // duplicate for variable
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:${jUnitVersion}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${jUnitVersion}")
    testCompile("org.junit.jupiter:junit-jupiter-params:${jUnitVersion}")
    testImplementation("org.hamcrest:hamcrest:${hamcrestVersion}")

}

tasks.withType<Test> {
    useJUnitPlatform()
}