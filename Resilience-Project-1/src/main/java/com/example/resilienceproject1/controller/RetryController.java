package com.example.resilienceproject1.controller;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/a")
public class RetryController {
    @Autowired
    private RestTemplate restTemplate;
    private static final String Micro_1= "micro_a";
    private static final String url ="http://localhost:8082/api/b/wish";

    @GetMapping("/getDataFromB")
    @Retry(name = Micro_1, fallbackMethod = "fallBackForTheMethod")
    public String getDataFromB(){
        return restTemplate.getForObject(url, String.class);
    }
    public String fallBackForTheMethod(Exception e){
        return "This is modified by vichhai docker from fallback .";
    }
}
