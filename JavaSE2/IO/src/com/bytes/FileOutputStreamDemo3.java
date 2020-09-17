package com.bytes;

/*
    字节流写数据的两个小问题：
        字节流写数据如何实现换行？
            windows: \r\n
            linux: \n
            mac: \r

        字节流写数据如何实现追加写入？
            public FileOutputStream(String name, boolean append)
                创建文件输出流以指定的名称写入文件
                如果第二个参数为true，则字节将写入文件的末尾而不是开头

 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("IO\\src\\com\\fos3.txt", true);


        // 写数据
        for (int i = 0; i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }

        // 释放资源
        fos.close();
    }
}
