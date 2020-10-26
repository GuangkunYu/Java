package com.anli;

/*
    需求：
        把文本文件中的数据读取到集合中，并遍历集合
    要求：
        文件中每一行数据是一个集合元素

 */

import java.io.*;
import java.util.ArrayList;

public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        // 创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("IO\\src\\com\\arrayListToTxt"));

        // 创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<>();

        // 调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line = br.readLine()) != null) {
            // 把读取到的字符串数据存储到集合中
            array.add(line);
        }

        // 释放资源
        br.close();

        // 遍历集合
        for (String s : array) {
            System.out.println(s);
        }
    }
}