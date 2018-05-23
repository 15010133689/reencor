package com.reencor.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUtils {
    public static ExecutorService cachedPool = Executors.newCachedThreadPool();

    public static ExecutorService getCachedPool() {
        return cachedPool;
    }
}
