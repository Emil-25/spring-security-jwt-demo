package com.demo.securityapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/user")
    public String users() {
        return "Users can access";
    }

    @GetMapping("/manager")
    public String managers() {
        return "Managers can access";
    }

    @GetMapping("/admin")
    public String admins() {
        return "Admins can access";
    }
}
