package com.bufferchar;

/*
    案例：复制Java文件（字符缓冲流特有功能改进版）
 */

import java.io.*;

public class CopyJavaDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IO\\src\\com\\bufferchar\\BufferCharMethod.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\src\\com\\bufferchar\\Copy2"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
