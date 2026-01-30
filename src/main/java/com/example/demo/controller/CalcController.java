package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calc")
public class CalcController {

    // GET http://localhost:8080/api/calc/sum?a=2&b=3
    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    // GET http://localhost:8080/api/calc/div?a=10&b=2
    @GetMapping("/div")
    public double div(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("b must not be 0");
        }
        return a / b;
    }
}
