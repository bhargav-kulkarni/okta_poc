package com.example.oktatokenip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApis {

    @GetMapping("/")
    public String test() {
        return "hello";
    }
}
