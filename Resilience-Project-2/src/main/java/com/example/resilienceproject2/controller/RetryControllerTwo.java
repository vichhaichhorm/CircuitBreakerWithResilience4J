package com.example.resilienceproject2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/b")
public class RetryControllerTwo {
    @GetMapping("/wish")
    public String wish(){
        return "Hello vichhai kafka .";
    }
}
