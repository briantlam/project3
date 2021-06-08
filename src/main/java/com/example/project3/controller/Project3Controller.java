package com.example.project3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project3Controller{
    @RequestMapping("/hello")
    public static String sayHello(){
        return "Hello World!";
    }
}
