package com.reencor.interapi;

import com.reencor.display.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("svc-login")
public interface SVCLoginInterApi {
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    User regist(User  user);
    @RequestMapping(value = "/findByUserid",method = RequestMethod.POST)
    User findByUserid(String userid);
    @RequestMapping(value = "/active",method = RequestMethod.POST)
    User active(User user);
}
