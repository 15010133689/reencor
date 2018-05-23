package com.reencor.controller;

import com.google.gson.Gson;
import com.reencor.display.entity.User;
import com.reencor.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {

    @Autowired
    DisplayService displayService;
    @Autowired
    Gson gson;
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    @ResponseBody
    public User home(User user) {
        return displayService.test(user);
    }
}
