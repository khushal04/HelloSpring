package com.example.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String hello() {
        return "Hello, World!";
    }
    @RequestMapping("/hello")
    public String hello_2(){
        return "Hello 2 is called";
    }
}
