package com.example.demo.controller;

import com.example.demo.dto.HelloResponse;
import com.example.demo.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HelloController {

    private final GreetingService greetingService;

    // GET http://localhost:8080/api/hello?name=Ibragim
    @GetMapping("/hello")
    public HelloResponse hello(@RequestParam(required = false) String name) {
        HelloResponse res = new HelloResponse();
        res.setMessage(greetingService.buildGreeting(name));
        res.setTimestamp(Instant.now().toString());
        return res;
    }

    // GET http://localhost:8080/api/ping
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
