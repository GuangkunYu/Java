package com.specialflow.PrintStreamIO;

/*
    打印流：
        字节打印流：PrintStream
        字符打印流：PrintWriter

    特点：
        只负责输出数据，不负责读取数据
        有自己的特有方法

    字节打印流：
        PrintStream(String fileName): 使用指定的文件名创建新的打印流
        使用继承父类的方法写数据，查看的时候会转码；使用自己的特有方法写数据，查看的数据原样输出
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // PrintStream(String fileName): 使用指定的文件名创建新的打印流
        PrintStream ps = new PrintStream("./ps.txt");

        // 写数据
        // 字节输出流有的方法
//        ps.write(97);

        // 使用特有方法写数据
//        ps.print(97);
//        ps.println();
//        ps.print(98);

        ps.println(97);
        ps.println(98);

        // 释放资源
        ps.close();
    }
}
