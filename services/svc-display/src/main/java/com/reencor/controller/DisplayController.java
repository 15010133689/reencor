package com.reencor.controller;

import com.google.gson.Gson;
import com.reencor.display.entity.User;
import com.reencor.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
