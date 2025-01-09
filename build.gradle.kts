plugins {
    java
    id("org.springframework.boot") version "3.4.1"
    id("io.spring.dependency-management") version "1.1.7"
    id("org.graalvm.buildtools.native") version "0.10.4"
    id("gg.jte.gradle") version "3.1.12"
}

group = "com.nerdmeeting"
version = "0.2.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("gg.jte:jte:3.1.12")
    implementation("gg.jte:jte-spring-boot-starter-3:3.1.12")
    compileOnly("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.11.4")
}

jte {
    generate()
    binaryStaticContent = true
}

tasks.withType<Test> {
    useJUnitPlatform()
}
