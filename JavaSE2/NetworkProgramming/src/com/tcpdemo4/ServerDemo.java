package com.tcpdemo4;

/*
    服务器：
            接收到的数据写入文本文件
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10000);

        // 监听客户端连接，返回一个对应得Socket对象
        Socket s = ss.accept();

        // 获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // 把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("NetworkProgramming\\src\\com\\tcpdemo4\\Copy.txt"));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        // 释放资源
        bw.close();
        ss.close();
    }
}
