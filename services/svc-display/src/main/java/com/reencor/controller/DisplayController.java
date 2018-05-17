package com.reencor.controller;

import com.google.gson.Gson;
import com.reencor.display.entity.User;
import com.reencor.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {

    @Autowired
    DisplayService displayService;
    @Autowired
    Gson gson;
    @Value("${server.port}")
    String port;
    @RequestMapping("/test")
    public String home(String user) {
        User dd=gson.fromJson(user,User.class);
        displayService.test(dd);
        return gson.toJson(new User("22","tttt"));
    }
}
