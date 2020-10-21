package com.thread;

/*
    实现多线程：
        进程：
            正在运行的程序
            是系统进行资源分配和调用的独立单位
            每一个进程都有它自己的内存空间和系统资源

        线程：
            是进程中的单个顺序控制流，是一条执行路径

            单线程：
                一个进程如果只有一条执行路径，则称为单线程程序

            多线程：
                一个进程如果有多条执行路径，则称为多线程程序

            举例：
                记事本程序
                扫雷程序

    多线程的实现方式：
        方式1：继承Thread类
            定义一个类MyThread继承Thread类
            在MyThread类中重写run()方法
            创建MyThread类的对象
            启动线程

            两个小问题：
                为什么要重写run()方法？
                    因为run()是用来封装被线程执行的代码
                run()方法和start()方法的区别？
                    run(): 封装线程执行的代码，直接调用，相当于普通方法的调用
                    start()：启动线程；然后由JVM调用此线程的run()方法

            设置和获取线程名称：
                void setName(String name)：将此线程的名称更改为等于参数name
                String getName()：返回此线程的名称
                通过构造方法也可以设置线程名称

            如何获取main()方法所在
 */

public class Multithreading {
    public static void main(String[] args) {
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//
////        my1.run();
////        my2.run();
//        my1.setName("高铁");
//        my2.setName("飞机");

//        MyThread my1 = new MyThread("飞机");
//        MyThread my2 = new MyThread("高铁");
//
//        my1.start();
//        my2.start();

        // static Thread currentThread()：返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
