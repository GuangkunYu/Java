package com.specialflow.PrintStreamIO;

/*
    案例：复制Java文件
    需求：
        把模块目录下的PrintStreamDemo.java复制到模块目录下的Copy.java
 */

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        // 根据数据源创建字符输入流对象
        BufferedReader bf = new BufferedReader(new FileReader("IO\\src\\com\\specialflow\\PrintStreamIO\\PintStreamDemo.java"));

        // 根据目的地创建字符输出流对象
        PrintWriter pw = new PrintWriter(new FileWriter("IO\\Copy.java"), true);

        // 读写数据，复制文件
        String line;
        while ((line = bf.readLine())!=null){
            pw.println(line);
        }

        // 释放资源
        pw.close();
        bf.close();
    }
}
