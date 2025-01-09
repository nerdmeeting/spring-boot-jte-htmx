package com.nerdmeeting.springbootjtehtmx.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
}
