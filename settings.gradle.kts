rootProject.name = "untitled"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            val githubUrl: String by settings

            name = "github"
            url = uri("$githubUrl/*")
            credentials(PasswordCredentials::class)
        }
        mavenLocal()
    }
}

include("gradle-plugin")
include("jenkins-plugin")
