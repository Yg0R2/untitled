plugins {
    java
    `kotlin-dsl`
    id("org.eazyportal.plugin.release") version("0.0.1-SNAPSHOT")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

release {
    scm {
        releaseBranch = "master"
        featureBranch = "master"
        remote = "origin"
    }
}
