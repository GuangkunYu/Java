package com.bufferbytes;

/*
    字节缓冲流：
        BufferOutputStream：
            该类实现缓冲输出流。通过设置这样的输出流，应用程序可以向底层
            输出流写入字节，而不必为写入的每个字节导致底层系统的调用
        BufferedInputStream:
            创建BufferedInputStream将创建一个内部缓冲区数组。当从流中
            读取或跳过字节时，内部缓冲区将根据需要从所包含的输入流中重新
            填充，一次很多字节

    构造方法：
        字节缓冲输出流：
            BufferedOutputStream(OutputStream out)
        字节缓冲输入流：
            BufferedInputStream(InputStream in)

    为什么构造方法需要的是字节流，而不是具体的文件或者路径呢？
        字节缓冲流仅仅提供缓冲区，而真正的读写数据还得依靠基本的字节流对象进行操作

 */

import java.io.*;

public class BufferDemo {
    public static void main(String[] args) throws IOException {
        // 创建字节缓冲输出流对象
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IO\\src\\com\\bufferbytes\\bos.txt"));

        // 写入数据
//        bos.write("hello\r\n".getBytes());
//        bos.write("world\r\n".getBytes());

        // 释放资源
//        bos.close();

        // 创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IO\\\\src\\\\com\\\\bufferbytes\\\\bos.txt"));

        // 读取数据
//        int by;
//        while ((by = bis.read())!= -1){
//            System.out.print((char)by);
//        }

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            System.out.print(new String(bytes, 0, len));
        }
        bis.close();
    }
}
