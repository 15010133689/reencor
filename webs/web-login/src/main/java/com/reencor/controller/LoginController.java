package com.reencor.controller;

import org.apache.http.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/regist")
    public String regist(HttpRequest request, HttpResponse response){

        return "/success";
    }
}
