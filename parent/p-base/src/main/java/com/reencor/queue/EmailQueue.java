package com.reencor.queue;

import com.reencor.display.entity.User;

import java.util.concurrent.LinkedBlockingDeque;

public class EmailQueue {
    public static LinkedBlockingDeque<User>  unvalidateUserQueue=new LinkedBlockingDeque<User>();

    public static LinkedBlockingDeque<User> getUnvalidateUserQueue() {
        return unvalidateUserQueue;
    }
}
