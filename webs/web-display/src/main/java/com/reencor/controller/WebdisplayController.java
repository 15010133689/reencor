package com.reencor.controller;

import com.google.gson.Gson;
import com.reencor.display.entity.User;
import com.reencor.interapi.SVCDisplayInterApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebdisplayController {

    @Autowired
    SVCDisplayInterApi svcDisplayInterApi;
    @Autowired
    Gson gson;

    @RequestMapping("/test")
    public void test(){
        try {
            System.out.println(svcDisplayInterApi.test(gson.toJson(new User("小明","1501000000"))));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
