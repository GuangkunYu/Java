package com.bufferbytes;
/*
    四种方式实现复制视频，并记录每种方式复制视频的时间
        1.基本字节流一次读写一个字节
        2.基本字节流一次读写一个字节数组
        3.字节缓冲流一次读写一个字节
        4.字节缓冲流一次读写一个字节数组
 */

import java.io.*;

public class CopyVideoDemo {
    public static void main(String[] args) throws IOException {
        // 记录开始时间
        long startTime = System.currentTimeMillis();

//        method1();   共耗时：539616毫秒
//        method2();  共耗时：911毫秒
//        method3();  共耗时：2082毫秒
        method4();  // 共耗时：186毫秒

        // 记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
    }

    private static void method4() throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IO\\src\\com\\bufferbytes\\02_字节流复制视频.avi"));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\学习视频\\day9\\02_字节流复制视频.avi"));

        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys)) != -1){
            bos.write(bys, 0, len);
        }

        bis.close();
        bos.close();
    }

    private static void method3() throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IO\\src\\com\\bufferbytes\\02_字节流复制视频.avi"));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\学习视频\\day9\\02_字节流复制视频.avi"));

        int bys;
        while ((bys=bis.read()) != -1){
            bos.write(bys);
        }

        bis.close();
        bos.close();

    }

    private static void method2() throws IOException {
        FileOutputStream fos = new FileOutputStream("IO\\src\\com\\bufferbytes\\02_字节流复制视频.avi");
        FileInputStream fis = new FileInputStream("E:\\学习视频\\day9\\02_字节流复制视频.avi");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys)) != -1){
            fos.write(bys, 0, len);
        }

        fis.close();
        fos.close();
    }

    // 1.基本字节流一次读写一个字节
    // E:\学习视频\day9\\02_字节流复制视频.avi  IO\\src\\com\\bufferbytes\\02_字节流复制视频.avi
    private static void method1() throws IOException {
        FileOutputStream fos = new FileOutputStream("IO\\src\\com\\bufferbytes\\02_字节流复制视频.avi");
        FileInputStream fis = new FileInputStream("E:\\学习视频\\day9\\02_字节流复制视频.avi");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
