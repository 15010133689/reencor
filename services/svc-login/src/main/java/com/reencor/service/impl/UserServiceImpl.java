package com.reencor.service.impl;


import com.reencor.base.enums.EnumUtil;
import com.reencor.dao.daos.UserDao;
import com.reencor.display.entity.User;
import com.reencor.queue.EmailQueue;
import com.reencor.queue.SendEmailThread;
import com.reencor.service.UserService;
import com.reencor.utils.ThreadPoolUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.concurrent.ExecutorService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Transactional
    public User register(User user) {
        user.setUserId(user.getObjectId());
        user.setIsvalidate(EnumUtil.UNVALIDATE.getValue());
        user.setCreatetime(new Date());
        ThreadPoolUtils.getCachedPool().execute(new SendEmailThread(EmailQueue.getUnvalidateUserQueue(),user));
       return userDao.save(user);
    }

    @Override
    public User findByUserid(String userid) {
        return userDao.findById(userid).orElse(null);
    }

    @Override
    @Transactional
    public User active(User user) {
        return userDao.save(user);
    }
}
