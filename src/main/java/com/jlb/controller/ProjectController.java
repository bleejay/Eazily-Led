package com.jlb.controller;

import com.jlb.data.ProjectRepository;
import com.jlb.model.Contact;
import com.jlb.model.Project;
import com.jlb.model.SimpleEmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
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

    @RequestMapping(value = "/ContactRequest", method = RequestMethod.POST)
    public RedirectView contactRequest (@Valid @ModelAttribute("Contact") Contact contact){
        ApplicationContext context = new ClassPathXmlApplicationContext("mailSenderBean.xml");
        SimpleEmailSender simpleEmailSender = new SimpleEmailSender();
        simpleEmailSender.setMailSender((MailSender) context.getBean("mailSender"));
        simpleEmailSender.sendEmail(contact.getSubject(), contact.getName(), contact.getEmail(), contact.getContactNumber(),contact.getMessage());
        return new RedirectView("contact");
    }
}
