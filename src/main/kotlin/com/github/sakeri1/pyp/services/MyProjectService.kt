package com.github.sakeri1.pyp.services

import com.intellij.openapi.project.Project
import com.github.sakeri1.pyp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
