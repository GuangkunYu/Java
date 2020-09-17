package com.bytes;

/*
    字节流读数据（一次读一个字节数组数据）
    需求：
        把文件fos.txt中的内容读取出来在控制台输出

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO\\src\\com\\fos.txt");

//        byte[] bys = new byte[20];
//
//        int read = fis.read(bys);
//        System.out.println(read);
//
////        System.out.println(new String(bys));
//        System.out.println(new String(bys, 0, read));


        byte[] bys = new byte[1024];

        int len;
        while ((len=fis.read(bys)) != -1){
            System.out.print(new String(bys,0,len));
        }

        fis.close();
    }
}
