package com.specialflow.standardIO;

/*
    public static final PrintStream out:
        标准输出流，通常该流对应于显示输出或由主机环境或用户指定的另一个输出目标
 */

import java.io.PrintStream;

public class SystemOutDemo {
    public static void main(String[] args) {

        // public static final PrintStream out:标准输出流
        PrintStream ps = System.out;

        // 能够方便的打印各种数据值
//        ps.print("hello");
//        ps.print(100);

//        ps.println("hello");
//        ps.println(100);

        // System.out的本质是一个字节输出流
        System.out.println("hello");
        System.out.println(100);
    }
}

/*
    输出语句的本质：是一个标准的输出流
        PrintStream ps = System.out;
        PrintStream类有的方法，System.out都可以使用
 */
