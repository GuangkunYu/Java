package com.tcpdemo4;

/*
    TCP通信程序练习：
        客户端：
            数据来自于文本文件
        服务器：
            接收到的数据写入文本文件
 */

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 创建客户端Socket对象
        Socket s = new Socket("192.168.4.192", 10000);

        // 数据来自于键盘录入，直到输出的数据是886，发送数据结束
        BufferedReader br = new BufferedReader(new FileReader("NetworkProgramming\\src\\InetAddressDemo.txt"));
        // 封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            // 获取输出流对象
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        // 释放资源
        br.close();
        s.close();
    }
}
