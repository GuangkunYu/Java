package com.udp;

/*
    UDP发送数据的步骤：
        1.创建发送端的Socket对象（DatagramSocket）
        2.创建数据，并把数据打包
        3.调用DatagramSocket对象的方法发送数据
        4.关闭发送端
 */

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 创建发送端的Socket对象（DatagramSocket）
        DatagramSocket ds = new DatagramSocket();

        // 创建数据，并把数据打包
        byte[] bys = "hello,udp,我来了".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("192.168.4.122");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys, length, address, port);
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.4.122"), 10086);

        // 调用DatagramSocket对象的方法发送数据
        ds.send(dp);

        // 关闭发送端
        ds.close();
    }
}
