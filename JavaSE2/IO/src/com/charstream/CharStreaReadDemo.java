package com.charstream;

/*
    字符流读数据的2中方式：
        int read()              一次读一个字符数据
        int read(char[] cbuf)   一次读一个字符数组数据
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharStreaReadDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IO\\src\\com\\charstream\\osw1.txt"));

//        一次读一个字符数据
//        int ch;
//        while ((ch=isr.read())!= -1){
//            System.out.print((char)ch);
//        }

//        一次读一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1){
            System.out.print(new String(chs, 0, len));
        }
        isr.close();
    }
}
