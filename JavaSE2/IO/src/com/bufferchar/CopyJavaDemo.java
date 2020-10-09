package com.bufferchar;

/*
    复制Java文件（字符缓冲流改进版）
 */

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IO\\src\\com\\bufferchar\\BufferCharDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\src\\com\\bufferchar\\Copy"));

        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1){
            bw.write(chs, 0, len);
        }

        br.close();
        bw.close();
    }
}
