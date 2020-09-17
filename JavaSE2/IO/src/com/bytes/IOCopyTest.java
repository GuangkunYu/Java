package com.bytes;

/*
    案例：复制文本文件
    需求：把“IO\src\com\fos.txt”复制到模块目录下“IO\src\com\bytes\fos.txt”
    分析：复制文本文件，其实就把文本文件的内容从一个文件中读取出来（数据源），
         然后写入到另一个文件中（目的地）
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopyTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO\\src\\com\\fos.txt");
        FileOutputStream fos = new FileOutputStream("IO\\src\\com\\bytes\\fos.txt");

        int read;
        while ((read=fis.read()) != -1){
            fos.write(read);
        }

        fis.close();
        fos.close();
    }
}
