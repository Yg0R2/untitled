plugins {
    id("eazy-java-conventions")

    id("org.jenkins-ci.jpi") version("+")
}

jenkinsPlugin {
    jenkinsVersion.set("2.319")
    displayName = "Untitled"
}

dependencies {
    implementation(platform("io.jenkins.tools.bom:bom-2.319.x:+"))

    implementation(project(mapOf("path" to ":gradle-plugin", "configuration" to "instrumentedJar")))
}
