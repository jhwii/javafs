package com.example.secondproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/hello")
    public String niceToMeetYou(){
        return "hello";
    }
}
