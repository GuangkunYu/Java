package com.exception;

/*
    异常处理之throws：
        虽然通过try...catch...可以对异常进行处理，但是并不是所有的情况我们都有权限进行异常的处理
        也就是说，有时候可能出现的异常是我们处理不了的，这个时候怎么办？
        针对这种情况，Java提供了throws的处理方案

        格式：
            throws 异常类名;
        注意：
            这个格式是跟在方法的括号后面的

        编译时异常必须要进行处理，两种处理方案：
            try...catch...或者throws，如果采用throws这种方案，将来谁调用谁处理
        运行时异常可以不处理，出现问题后，需要我们回来修改代码
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDemo {
    public static void main(String[] args) throws ParseException {
        System.out.println("开始");
//        method();
        method2();
        System.out.println("结束");
    }

    // 编译时异常
    public static void method2() throws ParseException {

        String s = "2048-08-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    // 运行时异常
//    public static void method() throws ArrayIndexOutOfBoundsException{
//
//        int[] arr = {1, 2, 3};
//        System.out.println(arr[3]);
//
//    }
}


