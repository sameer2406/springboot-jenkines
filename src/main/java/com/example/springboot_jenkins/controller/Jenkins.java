package com.example.springboot_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins {
    @GetMapping("/hello")
    public String hello() {
        return"hello jenkins";
    }

}