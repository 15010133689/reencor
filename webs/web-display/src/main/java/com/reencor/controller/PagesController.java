package com.reencor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
    @RequestMapping("/index")
    public String test(){
        return "/index";
    }
    @RequestMapping("/registration")
    public String registration(){
        return "/registration";
    }
    @RequestMapping("/login")
    public String login(){
        return "/login";
    }
}
