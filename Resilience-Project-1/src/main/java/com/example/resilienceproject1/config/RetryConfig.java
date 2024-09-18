package com.example.resilienceproject1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RetryConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
