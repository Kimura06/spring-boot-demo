package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class GreetingService {

    public String buildGreeting(String name) {
        String cleanName = (name == null || name.isBlank()) ? "world" : name.trim();
        return "Hello, " + cleanName + "! Time: " + Instant.now();
    }
}


