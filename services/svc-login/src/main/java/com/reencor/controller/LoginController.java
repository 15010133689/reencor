package com.reencor.controller;

import com.google.gson.Gson;
import com.reencor.display.entity.User;
import com.reencor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserService userService;
    @Autowired
    Gson gson;
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    @ResponseBody
    public User register(User user) {
        return userService.register(user);
    }
    @RequestMapping(value = "/findByUserid")
    @ResponseBody
    public User findByUserid(String userid){
        return userService.findByUserid(userid);
    }
    @RequestMapping(value = "/active")
    @ResponseBody
    public User active(User user){
        return userService.active(user);
    }

}
