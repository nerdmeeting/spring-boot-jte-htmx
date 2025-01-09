package com.nerdmeeting.springbootjtehtmx.controller;

import com.nerdmeeting.springbootjtehtmx.entity.Task;
import com.nerdmeeting.springbootjtehtmx.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {
    
    private static final Logger log = LoggerFactory.getLogger(TaskController.class);
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        return "index";
    }
    
    @PostMapping("/add-task")
    public String addTask(@RequestParam String description, Model model) {
        Task task = new Task(description);
        taskRepository.create(task);
        model.addAttribute("task", task);
        return "task-row";
    }
}
