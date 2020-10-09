package com.specialflow.standardIO;

/*
    标准输入输出流：
        System类中有两个静态的成员变量：
            InputStream in:
                标准输入流；
                通常该流对应于键盘输入或由主机环境或用户指定的另一个输入源
            PrintStream out:
                标准输出流；
                通常该流对应于显示输出或由主机环境或用户指定的另一个输出目标
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {
//        InputStream is = System.in;

//        int by;
//        while ((by=is.read())!=-1){
//            System.out.print((char)by);
//        }

        // 如何把字节流转换为字符流？用转换流
//        InputStreamReader isr = new InputStreamReader(is);

        // 使用字符流能不能够实现一次读取一行数据呢？可以
        // 但是，一次读取一行数据的方法是字符缓冲输入流的特有方法
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串：");

        String s = br.readLine();

        System.out.println("你输入的字符串是：" + s);

        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是：" + i);

        Scanner sc = new Scanner(System.in);


    }
}
