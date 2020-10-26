package com.thread;

/*
    多线程的实现方式2：
        实现Runnable接口：
            定义一个类MyRunnable实现Runnable接口
            在MyRunnable类中重写run()方法
            创建MyRunnable类的对象
            创建Thread类的对象，把MyRunnable对象作为构造方法的参数
            启动线程

        好处：
            避免了Java单继承的局限性
            适合多个相同程序的代码去处理同一个资源的情况，把线程和程序的代码、数据有效分离，较好的体现了面向对象的设计思想
 */

public class MultithreadRunnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "飞机");
        Thread t2 = new Thread(mr, "高铁");

        t1.start();
        t2.start();
    }
}
