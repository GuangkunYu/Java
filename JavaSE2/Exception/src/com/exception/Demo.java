package com.exception;

/*
    异常：
        就是程序出现了不正常的情况

    异常体系：
                        Error
        Throwable                       RuntimeException
                        Exception
                                        非RuntimeException
        Error：严重问题，不需要处理
        Exception：称为异常类，它表示程序本身可以处理的问题
            RuntimeException：
                在编译期是不检查的，出现问题后，需要我们回来修改代码
            非RuntimeException：
                编译期就必须处理的，否则程序不能通过编译，就更不能正常运行了

    JVM的默认处理方案：
        如果程序出现了问题，我们没有做任何处理，最终JVM会做默认的处理
        - 把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
        - 程序停止执行

    异常处理：
        如果程序出现了问题，我们需要自己来处理，有两种方案：
            try...catch...:
                格式：
                    try {
                        可能出现异常的代码;
                    } catch(异常类名 变量名) {
                        异常的处理代码;
                    }
                执行流程：
                    程序从try里面的代码开始执行
                    出现异常，会自动生成一个异常类对象，该异常对象将被提交给Java运行时系统
                    当Java运行时系统接收到异常对象时，会到catch中去找匹配的异常类，找到后进行异常的处理
                    执行完毕后，程序还可以继续往下执行
            throws
 */

public class Demo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("索引存在异常");
            e.printStackTrace();
        }

    }
}
