package api_gramar;

/*
    API:
        应用程序编程接口
    java api：
        指的就是jdk中提供的各种功能的java类
        这些类将底层的实现封装了起来，我们不需要关心这些类是如何实现的，
        只需要学习这些类如何使用即可，通过帮助文档

    练习scanner的api
        Scanner：
            用于获取键盘录入数据（基本数据类型，字符串数据）
        public String nextLine():
            获取键盘录入字符串数据
 */

import java.util.Scanner;

public class Api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字符串：");
        String line = sc.nextLine();

        System.out.println("你输入的数据是：" + line);
    }
}
