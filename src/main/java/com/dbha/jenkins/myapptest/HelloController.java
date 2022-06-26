package com.dbha.jenkins.myapptest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
    @GetMapping
    public String hello() {
<<<<<<< HEAD
        return "Spring Boot TBS Test";
=======
        return "Spring Boot my test1";
>>>>>>> b5e511bc839cf2d7e0342c55d1aa290e803c8405
    }
}
