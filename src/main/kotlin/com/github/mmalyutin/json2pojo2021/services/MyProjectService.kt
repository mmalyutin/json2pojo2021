package com.github.mmalyutin.json2pojo2021.services

import com.github.mmalyutin.json2pojo2021.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
