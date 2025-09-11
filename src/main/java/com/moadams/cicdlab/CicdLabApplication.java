package com.moadams.cicdlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdLabApplication.class, args);
    }

    @GetMapping("/")
    public String home(){
        return "<h1>Michael Okyere Adams</h1> <h2>Lab 1: Highly Available Full-Stack Application</h2>";
    }
}
