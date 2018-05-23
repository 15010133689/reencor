package com.reencor.queue;

import com.reencor.display.entity.User;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class SendEmailThread implements Runnable {
    private volatile boolean isRunning= true;
    private BlockingQueue queue;
    private User unvalidateUser;
    private static final int DEFAULT_RANGE_FOR_SLEEP = 1000;
    public SendEmailThread(BlockingQueue queue, User unvalidateUser) {
        this.queue = queue;
        this.unvalidateUser=unvalidateUser;
    }

    @Override
    public void run() {
        Random r = new Random();
        try {
            while (isRunning) {
                Thread.sleep(r.nextInt(DEFAULT_RANGE_FOR_SLEEP));
                if (queue.offer(unvalidateUser, 2, TimeUnit.SECONDS)) {
                    System.out.println("放入用户成功：" + unvalidateUser.getEmail());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
