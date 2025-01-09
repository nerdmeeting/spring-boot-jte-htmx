package com.nerdmeeting.springbootjtehtmx.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class TemplateController {
    
    @GetMapping
    public String home(Model model) {
        model.addAttribute("username", "John Doe");
        return "pages/home";
    }
    
    @GetMapping("/team")
    public String team(Model model) {
        List<String> teamMembers = List.of("Alice", "Jose", "Charlie", "Michell", "Lauris");
        model.addAttribute("teamMembers", teamMembers);
        return "pages/team";
    }
    
    @GetMapping("/projects")
    public String projects(Model model) {
        List<String> projects = List.of("Project 1", "Project 2", "Project 3", "Project 4");
        Map<String, Object> attributes = Map.of(
                "username", "John Doe",
                "projects", projects
        );
        model.addAllAttributes(attributes);
        return "pages/projects";
    }
}
