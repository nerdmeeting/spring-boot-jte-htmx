package com.nerdmeeting.springbootjtehtmx.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Task {
    
    private final String id;
    private final String description;


    public Task(String description) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
    }
}
