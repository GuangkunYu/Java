package com.inetaddress;

/*
    网络编程：
        在网络通信协议下，实现网络互连的不同计算机上运行的程序间可以进行数据交换

    网络编程三要素：
        IP地址
        端口:
            0~65535
            0~1023被知名网络服务应用，普通应用使用1024以上的端口号
        协议：
            UDP：
                用户数据报协议
                无连接通信协议，数据传输时，发送端和接收端不建立逻辑连接
                消耗资源小，通信效率高，常用于音频、视频和普通数据的传输
                不能保证数据的完整性
            TCP：
                传输控制协议
                面向连接的通信协议，数据传输之前，发送端和接收端建立逻辑连接，再传输数据
                可靠无差错的数据传输
                创建连接需要“三次握手”
                可以保证传输数据的安全，用于上传文件，下载文件，浏览网页

    InetAddress的使用：
        此类表示IP协议地址
        方法：
            static InetAddress getByName(String host):
                确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
            String getHostName()：
                获取此IP地址的主机名
            String getHostAddress()：
                返回文本显示中的IP地址字符串
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("YGK");
        InetAddress address = InetAddress.getByName("192.168.4.122");

        String name = address.getHostName();

        String ip = address.getHostAddress();

        System.out.println("主机名："+ name);
        System.out.println("IP地址："+ ip);
    }
}
