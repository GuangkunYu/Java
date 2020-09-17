package com.bytes;

/*
    字节流读数据(一次读一个字节数据)
    需求：把文件fos.txt中的内容读取出来在控制台输出

    FileInputStream：从文件系统中的文件获取输入字节
        FileInputStream(String name)：
            通过打开与实际文件的连接来创建一个FileInputStream，
            该文件由文件系统中的路径名name命名

    使用字节输入流读数据的步骤：
        1.创建字节输入流对象
        2.调用字节输入流对象的读数据方法
        3.释放资源

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO\\src\\com\\fos.txt");
//      读取1
//        int read = fis.read();
//        System.out.println(read);
//        System.out.println((char)read);

        // 读取2
//        while (read != -1){
//            System.out.print((char) read);
//            read = fis.read();
//        }

        // 优化上面的代码
        int read;
        /*
            fis.read()：读数据
            read=fis.read()：把读取到的数据赋值给read
            read!=-1：判断读取到的数据是否是-1
         */
        while ((read=fis.read()) != -1){
            System.out.print((char)read);
        }

        fis.close();
    }
}
