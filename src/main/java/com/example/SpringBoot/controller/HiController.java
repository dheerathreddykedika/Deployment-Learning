package com.example.SpringBoot.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping("/hi")
    public String sayHi(){
        return "Welcome to Spring Boot!" +"\n"+ "Hello";
    }


}
