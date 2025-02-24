package com.example.EurekaClientDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstServiceController {
    @GetMapping("/product")
    public String getFood() {
        return "음식";
    }
}