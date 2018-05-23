package com.reencor.service.impl;


import com.reencor.dao.daos.UserDao;
import com.reencor.display.entity.User;
import com.reencor.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DisplayServiceImpl implements DisplayService {
    @Autowired
    private UserDao userDao;
    @Override
    public User test(User name) {
       return userDao.findById("1").orElse(null);
    }
}
