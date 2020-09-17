package com.bytes;

/*
    字节流：
        IO流概述和分类：
            概述：
                IO：输入\输出（Input\Output）
                流：是一种抽象概念，是对数据传输的总称。
                    也就是说数据在设备间的传输称为流，流的本质是数据传输
                IO流就是用来处理设备间数据传输问题的
                    常见的应用：文件赋值；文件上传；文件下载
            IO流分类：
                - 按照数据的流向：
                    输入流：读数据
                    输出流：写数据
                - 按照数据类型来分：
                    字节流：
                        字节输入流；字节输出流
                    字符流：
                        字符输出流；字符输出流
                一般来说，我们说的IO流的分类是按照数据类型来分的
                那么这两种流都在什么情况下使用呢？
                    如果数据通过Windows自带的记事本软件打开，我们还可以读懂里面的内容，
                    就使用字符流，否则使用字节流。如果不知道该使用哪种类型的流，就使用字节流

    字节流写数据：
        字节流抽象基类：
            InputStream：这个抽象类是表示字节输入流的所有类的超类
            OutputStream：这个抽象类是表示字节输出流的所有类的超类
            子类名特点：子类名称都是以其父类名作为子类名的后缀

        FileOutputStream：文件输出流用于将数据写入File
            FileOutputStream(String name)：创建文件输出流以指定的名称写入文件

        使用字节输出流写数据的步骤：
            创建字节输出流对象（调用系统功能创建了文件，创建字节输出流对象，让字节输出流对象指向文件）
            调用字节输出流对象的写数据方法
            释放资源（关闭此文件输出流并释放与此流相关的任何系统资源）
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建字节流输出对象
        FileOutputStream fos = new FileOutputStream("IO\\src\\com\\fos.txt");
        /*
            做了3件事：
                1.调用系统功能创建了文件
                2.创建了字节流输出对象
                3.让字节流对象指向创建好的文件
         */

        // write(int b) : 将指定的字节写入此文件输出流
        fos.write(97);
//        fos.write(57);
//        fos.write(55);

        // 最后都要释放资源
        // close():关闭此文件输出流并释放与此流相关联的任何系统资源
        fos.close();
    }
}
