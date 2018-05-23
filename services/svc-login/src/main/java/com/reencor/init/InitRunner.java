package com.reencor.init;

import com.reencor.queue.EmailQueue;
import com.reencor.queue.ValidateUserThread;
import org.springframework.boot.CommandLineRunner;

public class InitRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("===========================初始化发送邮件处理线程============================");
        new Thread(new ValidateUserThread(EmailQueue.getUnvalidateUserQueue())).start();
    }
}
