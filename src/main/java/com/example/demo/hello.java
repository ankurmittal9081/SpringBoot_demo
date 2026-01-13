package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("/")
    public String Hello(){
        return "This is the First Line";
    }
    @GetMapping("/about")
    public String about(){
        return "This is the about page";
    }

    @GetMapping("/contact")
    public  String contact(){
        return "This is the Contact Page";
    }
}
