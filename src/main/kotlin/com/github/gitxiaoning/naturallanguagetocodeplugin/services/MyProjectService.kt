package com.github.gitxiaoning.naturallanguagetocodeplugin.services

import com.github.gitxiaoning.naturallanguagetocodeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
