package com.nttu.DevopsIntergrationApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "Hello World";
    }

    @GetMapping("/about")
    public String showAbout(){
        return "About page";
    }
}
