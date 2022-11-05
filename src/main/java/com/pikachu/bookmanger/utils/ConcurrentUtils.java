package com.pikachu.bookmanger.utils;

import com.pikachu.bookmanger.model.User;

/**
 * @Author: 橙子
 * @Date: 2022/11/6 0:25
 */
public class ConcurrentUtils {
    private static ThreadLocal<User> host = new ThreadLocal<>();

    public static User getHost() {
        return host.get();
    }

    public static void setHost(User user) {
        host.set(user);
    }
}
