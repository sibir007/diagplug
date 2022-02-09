package com.github.sibir007.diagplug.services

import com.intellij.openapi.project.Project
import com.github.sibir007.diagplug.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
