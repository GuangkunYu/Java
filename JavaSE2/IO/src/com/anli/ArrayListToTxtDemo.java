package com.anli;

/*
    需求：
        把ArrayList集合中的字符串数据写入到文本文件。
    要求：
        每一个字符串元素作为文件的一行数据
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        // 创建ArrayList集合
        ArrayList<String> als = new ArrayList<>();

        // 往集合中存储字符串元素
        als.add("hello");
        als.add("world");
        als.add("java");

        // 创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\src\\com\\arrayListToTxt"));

        // 遍历集合，得到每一个字符串数据
        for (String s : als) {
            // 调用字符缓冲输出流对象的方法写数据
            bw.write(s);
            bw.newLine();
            bw.flush();

        }

        // 释放资源
        bw.close();
    }
}
