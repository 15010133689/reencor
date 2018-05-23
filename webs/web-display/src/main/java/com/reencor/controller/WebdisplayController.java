package com.reencor.controller;

import com.google.gson.Gson;
import com.reencor.configuration.ConnectionFactoryConfigure;
import com.reencor.display.entity.User;
import com.reencor.interapi.SVCDisplayInterApi;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Controller
public class WebdisplayController {

    @Autowired
    SVCDisplayInterApi svcDisplayInterApi;
    @Autowired
    Gson gson;

    @RequestMapping("/test")
    public String test(){
        try {
            System.out.println(svcDisplayInterApi.test(new User("小明","1501000000",11)).getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/index";
    }
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/send")
    public String send3() {
        String uuid = UUID.randomUUID().toString();
        CorrelationData correlationId = new CorrelationData(uuid);
        rabbitTemplate.convertAndSend(ConnectionFactoryConfigure.EXCHANGE, ConnectionFactoryConfigure.ROUTINGKEY2, "哈哈", correlationId);
        return uuid;
    }


}
