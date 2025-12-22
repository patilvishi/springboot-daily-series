package com.example.day4.controller;

import com.example.day4.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AppInfoController {

    private final GreetingService greetingService;

    @GetMapping("/info")
    public String info() {
        return greetingService.greet();
    }
}
