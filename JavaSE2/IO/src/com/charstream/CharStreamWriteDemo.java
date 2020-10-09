package com.charstream;

/*
    字符流写数据的5种方式：
        void write(int c)                           写一个字符
        void write(char[] cbuf)                     写入一个字符数组
        void write(char[] cbuf, int off, int len)   写入字符数组的一部分
        void write(String str)                      写一个字符串
        void write(String str, int off, int len)    写一个字符串的一部分


        flush()         刷新流，还可以继续写数据
        close()         关闭流，释放资源，但是在关闭流之前会先刷新流。一旦关闭就不能再写数据
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CharStreamWriteDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IO\\src\\com\\charstream\\osw1.txt"));

//        写一个字符
//        osw.write(97);
        // 刷新流
//        osw.flush();
//        osw.write(98);
        // 先刷新，后关闭流
//        osw.close();

//        写入一个字符数组数据
        char[] chs = {'a', 'b', 'c', 'd', 'e'};
//        osw.write(chs);

//        写入字符数组的一部分
//        osw.write(chs, 1, chs.length-1);
//        osw.write(chs, 1, 3);

//        写入字符串
//        osw.write("abcde");

//        写入字符串的一部分
        osw.write("abcde", 1, 4);

        osw.close();
    }
}
