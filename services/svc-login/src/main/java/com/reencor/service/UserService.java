package com.reencor.service;

import com.reencor.display.entity.User;

public interface UserService {
    public User register(User user);
    public User findByUserid(String userid);
    public User active(User user);
}
