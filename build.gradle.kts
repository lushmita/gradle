plugins {
    java
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation(platform("io.cucumber:cucumber-bom:7.14.0"))

    testImplementation("io.cucumber:cucumber-junit-platform-engine")
    testImplementation("org.junit.platform:junit-platform-suite")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("junit:junit:4.13.1")

    testImplementation("io.cucumber:cucumber-java:6.10.4")
    testImplementation("io.cucumber:cucumber-junit:6.10.4")

}
