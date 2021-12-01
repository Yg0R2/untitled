import org.eazyportal.plugin.release.core.scm.model.ScmConfig.Companion.TRUNK_BASED_FLOW

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
    scm = TRUNK_BASED_FLOW
}
