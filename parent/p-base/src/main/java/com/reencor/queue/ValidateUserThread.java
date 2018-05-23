package com.reencor.queue;

import com.reencor.display.entity.User;
import com.reencor.utils.EmailUtils;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ValidateUserThread implements Runnable {

    private volatile boolean isRunning= true;
    private BlockingQueue queue;
    private static final int DEFAULT_RANGE_FOR_SLEEP = 1000;
    public ValidateUserThread(BlockingQueue queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            while (isRunning) {
                System.out.println("正从队列获取数据...");
                User unvalidateUser = (User) queue.take();
                if (null != unvalidateUser) {
                    System.out.println("正在发送激活邮件：" + unvalidateUser.getEmail());
                    EmailUtils.sendAccountActivateEmail(unvalidateUser);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
