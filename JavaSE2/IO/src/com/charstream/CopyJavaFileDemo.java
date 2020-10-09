package com.charstream;

/*
    案例：复制Java文件
 */

import java.io.*;

public class CopyJavaFileDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IO\\src\\com\\charstream\\BytesStringDemo.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IO\\src\\com\\copy.java"));

        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1){
            osw.write(chs, 0, len);
        }
        osw.close();
        isr.close();
    }
}
