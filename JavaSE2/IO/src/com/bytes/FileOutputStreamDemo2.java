package com.bytes;

/*
    构造方法：
        FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream(File file): 创建文件输出流以写入由指定的File对象表示的文件

    字节流写数据的3中方式：
        write(int b)    将指定的字节写入此文件输出流
                        一次写一个字节数据
        write(byte[] b)     将b.length字节从指定的字节数组写入此文件输出流
                            一次写一个字节数组数据
        write(byte[] b, int off, int len)   将len字节从指定的字节数组开始，从偏移量off开始
                                            写入此文件输出流，一次写一个字节数组的部分数据
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("IO\\src\\com\\fos2.txt");

//        File f = new File("IO\\src\\com\\fos2.txt");
//        FileOutputStream fos2 = new FileOutputStream(f);

//        byte[] bys = {97, 98, 99, 100, 101};
        byte[] bys = "abcde".getBytes();
//        fos.write(bys);

        fos.write(bys,1,3);
    }
}
