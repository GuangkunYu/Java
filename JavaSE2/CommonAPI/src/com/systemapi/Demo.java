package com.systemapi;

/*
    System包含几个有用的类字段和方法，它不能被实例化
        exit(int status)    终止当前运行的java虚拟机，非零表示异常终止
        currentTimeMillis()     返回当前时间（以毫秒为单位）
 */

public class Demo {
    public static void main(String[] args) {
//        System.out.println("开始");
//        System.exit(0);
//        System.out.println("结束");

//        System.out.println(System.currentTimeMillis());

//        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        long start = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        long s = end - start;
        System.out.println("共耗时：" + s + "毫秒");
    }
}
