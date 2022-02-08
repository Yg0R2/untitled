plugins {
    id("eazy-kotlin-library-conventions")

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

dependencies {
//    implementation(kotlin("stdlib"))
}
