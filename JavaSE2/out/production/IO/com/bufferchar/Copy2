package com.bufferchar;

/*
    字符缓冲流特有的功能：
        BufferedWriter:
            void newLine():
                写一行行分隔符，行分隔字符串由系统属性定义
        BufferedReader:
            String readLine():
                读一行文字，结果包含行的内容的字符串，不包括任何行终止字符，如果流结尾已经到达，则位null
 */

import java.io.*;

public class BufferCharMethod {
    public static void main(String[] args) throws IOException {
/*        // 创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\src\\com\\bufferchar\\bw2.txt"));

        // 写数据
        for (int i=0; i<10; i++){
            bw.write("hello" + i);
//            bw.write("\r\n");

            bw.newLine();
            bw.flush();
        }

        // 释放资源
        bw.close();

 */
        // 创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("IO\\src\\com\\bufferchar\\bw2.txt"));

        // 第一次读取数据
//        String line = br.readLine();
//        System.out.println(line);
//
//        // 第二次读数据
//        String line1 = br.readLine();
//        System.out.println(line1);
//
//        // 第三次读数据
//        String line2 = br.readLine();
//        System.out.println(line2);

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
