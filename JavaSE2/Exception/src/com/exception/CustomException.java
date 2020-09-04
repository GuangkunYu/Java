package com.exception;

/*
    自定义异常：
        格式：
            public class 异常类名 extends Exception{
                无参构造
                带参构造
            }

    throws和throw的区别：
        throws：
            用在方法声明后面，跟的是异常类名
            表示抛出异常，由该方法的调用者来处理
            表示出现异常的一种可能性，并不一定会发生这些异常
        throw：
            用在方法体内，跟的是异常对象名
            表示抛出异常，由方法体内的语句处理
 */

public class CustomException extends Exception{
    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
    }
}
