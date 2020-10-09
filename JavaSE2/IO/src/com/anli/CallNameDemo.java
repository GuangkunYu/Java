package com.anli;

/*
    案例：点名器
    需求：
        有一个文件里面存储了班级同学的姓名，每一个姓名占一行，要求通过程序实现随机点名器
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        // 创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("IO\\src\\com\\names.txt"));

        // 创建ArrayList集合对象
        ArrayList<String> names = new ArrayList<>();

        // 调用字符缓冲流对象的方法读数据
        String name;
        while ((name=br.readLine())!=null){
            // 把读取到的字符串数据存储到集合中
            names.add(name);
        }
        // 释放资源
        br.close();

        // 使用random产生一个随机数，随机数的范围在：[0, 集合长度)
        Random ran = new Random();
        int index = ran.nextInt(names.size());

        // 把上一步产生的随机数作为索引到ArrayList集合中获取值
        String s = names.get(index);

        // 把上一步得到的数据输出在控制台
        System.out.println("中奖人： " + s);
    }
}
