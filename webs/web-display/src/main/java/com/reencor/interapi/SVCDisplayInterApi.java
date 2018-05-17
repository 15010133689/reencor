package com.reencor.interapi;

import com.reencor.display.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("svc-display")
public interface SVCDisplayInterApi {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test(@RequestParam(value = "user")String  user);
}
