package com.reencor.controller;

import com.reencor.base.enums.EnumUtil;
import com.reencor.display.entity.User;
import com.reencor.interapi.SVCLoginInterApi;
import com.reencor.utils.GenerateLinkUtils;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    SVCLoginInterApi svcLoginInterApi;

    @RequestMapping("/regist")
    @ResponseBody
    public String regist(User user, HttpRequest request, HttpResponse response){
        svcLoginInterApi.regist(user);
        return "/success";
    }
    @RequestMapping("/active")
    public String active(String userid,String checkCode){
        //根据用户id查找用户
        User user = svcLoginInterApi.findByUserid(userid);

        //验证无误，状态更改为1，即激活
        if(GenerateLinkUtils.verifyCheckcode(user,checkCode)) {
            //修改状态
            user.setIsvalidate(EnumUtil.VALIDATED.getValue());
            svcLoginInterApi.active(user);
        }
        return "/success";
    }
}
