package com.exception;

/*
    Throwable的成员方法：
        getMessage()        返回此throwable的详细消息字符串
        toString()          返回此可抛出的简短描述
        printStackTrace()   把异常的错误信息输出在控制台
 */

public class ThrowableDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    private static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
