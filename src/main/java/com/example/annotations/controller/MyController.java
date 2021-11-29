package com.example.annotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "Hello , Welcome to my home";
    }
}
