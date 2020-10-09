package com.specialflow.PrintStreamIO;

/*
    字符打印流：
        PrintWriter(String fileName):
            使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新
        PrintWriter(Writer out, boolean autoFlush):
            创建一个新的PrintWriter：
                out：字符输出流
                autoFlush：一个布尔值，如果为真，则println，printf，或format方法将刷新输出缓冲区
 */

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        // PrintWriter(String fileName):
//        PrintWriter pw = new PrintWriter("IO\\pw.txt");

//        pw.write("hello");
//        pw.write("\r\n");
//        pw.flush();
//        pw.write("world");
//        pw.write("\r\n");
//        pw.flush();

//        pw.println("hello");
//        pw.flush();
//        pw.println("world");
//        pw.flush();

        // PrintWriter(Writer out, boolean autoFlush):
        PrintWriter pw = new PrintWriter(new FileWriter("IO\\pw.txt"), true);

        pw.println("hello");
        pw.println("world");

        pw.close();
    }
}
