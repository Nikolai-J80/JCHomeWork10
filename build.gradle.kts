plugins {
    id("java")
}

group = "ru.netology.nikolaJ80"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}

tasks.test {
    useJUnitPlatform()
}