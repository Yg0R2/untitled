plugins {
    id("org.eazyportal.plugin.kotlin-library-convention")

    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("untitled-gradle-plugin") {
            id = "$group.$name"
            implementationClass = "org.yg0r2.UntitledPlugin"
        }
    }
}

val instrumentedJar: Configuration by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = false
}

artifacts {
    add("instrumentedJar", tasks.jar)
}
