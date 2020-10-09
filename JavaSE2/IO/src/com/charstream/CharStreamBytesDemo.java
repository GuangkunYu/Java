package com.charstream;

/*
    字符流中的编码解码问题：
        字符流抽象基类：
            Reader: 字符输入流的抽象类
            Writer: 字符输出流的抽象类

        字符流中和编码解码问题相关的两个类：
            InputStreamReader
            OutputStreamWriter
 */

import java.io.*;

public class CharStreamBytesDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("osw.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IO\\src\\com\\charstream\\osw.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IO\\src\\com\\charstream\\osw.txt"),
                "gbk");
        osw.write("中国");
        osw.close();

//        FileInputStream fis = new FileInputStream("IO\\src\\com\\charstream\\osw.txt");
//        InputStreamReader isr = new InputStreamReader(fis);
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IO\\src\\com\\charstream\\osw.txt"),
                "gbk");

        // 一次读取一个字符数据
        int ch;
        while ((ch = isr.read()) != -1){
            System.out.print((char) ch);
        }
        isr.close();

    }
}
