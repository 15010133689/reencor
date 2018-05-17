package com.reencor.service.impl;


import com.reencor.display.entity.User;
import com.reencor.service.DisplayService;
import org.springframework.stereotype.Service;

@Service
public class DisplayServiceImpl implements DisplayService {
    @Override
    public void test(User name) {
        System.out.println("this is test "+name);
    }
}
