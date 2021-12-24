package com.dbha.jenkins.myapptest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
    @GetMapping
    public String hello() {
        return "Spring Boot New Image TEST4";
    }
}
