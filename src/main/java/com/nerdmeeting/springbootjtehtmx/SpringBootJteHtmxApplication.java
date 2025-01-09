package com.nerdmeeting.springbootjtehtmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@ImportRuntimeHints(ResourceRuntimeHints.class)
@SpringBootApplication
public class SpringBootJteHtmxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJteHtmxApplication.class, args);
    }

}
