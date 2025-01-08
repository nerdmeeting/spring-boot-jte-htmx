package com.nerdmeeting.springbootjtehtmx.repository;

import com.nerdmeeting.springbootjtehtmx.entity.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    
    private final List<Task> tasks = new ArrayList<>();
    
    public List<Task> findAll() {
        return tasks;
    }
    
    public void create(Task task) {
        tasks.add(task);
    }
    
    public boolean remove(String id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }
}
