package org.yg0r2

import org.gradle.api.Plugin
import org.gradle.api.Project

class UntitledPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.logger.quiet("hello")
    }

}
