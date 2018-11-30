package com.jlb.controller;

import com.jlb.data.ProjectRepository;
import com.jlb.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping("/projects")
    public String listProjects (ModelMap modelMap){
        List<Project> allProjects = projectRepository.getAllProjects();
        modelMap.put("projects", allProjects);
        return "projects";
    }

    @RequestMapping("/projects/{title}")
    public String projectDetails (@PathVariable String title, ModelMap modelMap){
        Project project = projectRepository.findByTitle(title);
        modelMap.put("project", project);
        return "project-details";
    }

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return "contact";
    }
}
