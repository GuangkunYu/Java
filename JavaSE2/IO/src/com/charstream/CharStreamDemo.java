package com.charstream;

/*
    需求：字节流读文本文件数据

    一个汉字存储：
        如果是GBK编码，占用2个字节
        如果是UTF-8编码，占用3个字节

    为什么会出现字符流：
        由于字节流操作中文不是特别方便，所以java就提供字符流
            字符流 = 字节流 + 编码表

        用字节流复制文本文件时，文本文件也会有中文，但是没有问题，原因
        是最终底层操作会自动进行字节拼接成中文，如何识别是中文的呢？
            汉字在存储的时候，无论选择哪种编码存储，第一个字节都是负数
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("IO\\src\\com\\a.txt");
//
//        int by;
//        while ((by=fis.read()) != -1){
//            System.out.print((char)by);
//        }
//
//        fis.close();


    }
}

/*
    编码表：
        基础知识：
            - 计算机中存储的信息都是用二进制数表示的；我们在屏幕上看到
              英文、汉字等字符是二进制数转换之后的结果
            - 按照某种规则，将字符存储到计算机中，称为编码。反之，将存储在
              计算机中的二进制数按照某种规则解析出来，称为解码。这里强调：
              按照A编码存储，必须按照A编码解析，这样才能显示正确的文本符号。
              否则就会导致乱码显现
                字符编码：就是一套自然语言的字符与二进制数之间的对应规则(A,65)

        字符集：
            - 是一个系统支持的所有字符的集合，包括各国家文字、标点符号、图形符号、数字等
            - 计算机要准确的存储和识别各种字符集符号，就需要进行字符编码，一套字符集必然
              至少有一套字符编码。
              常见字符集有ASCII字符集、GBXXX字符集、Unicode字符集等
 */
