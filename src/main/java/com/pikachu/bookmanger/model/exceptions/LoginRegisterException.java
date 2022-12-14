package com.pikachu.bookmanger.model.exceptions;

/**
 * @Author: 橙子
 * @Date: 2022/11/5 21:09
 */
//注册和登录时的异常
public class LoginRegisterException extends RuntimeException {
    public LoginRegisterException() {
        super();
    }

    public LoginRegisterException(String message) {
        super(message);
    }

    public LoginRegisterException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginRegisterException(Throwable cause) {
        super(cause);
    }
}
