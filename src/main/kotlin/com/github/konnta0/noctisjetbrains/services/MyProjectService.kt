package com.github.konnta0.noctisjetbrains.services

import com.intellij.openapi.project.Project
import com.github.konnta0.noctisjetbrains.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
