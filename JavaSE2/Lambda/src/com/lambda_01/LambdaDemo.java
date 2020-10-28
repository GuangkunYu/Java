package com.lambda_01;

/*
    体验Lambda表达式：
        需求：
            启动一个线程，在控制台输出一句话：多线程程序启动了

        方式1：
            定义一个类MyRunnable实现Runnable接口，重写run()方法
            创建MyRunnable类的对象
            创建Thread类的对象，把MyRunnable的对象作为构造参数传递
            启动线程

        方式2：
            匿名内部类的方式改进


        方式3：
            lambda表达式的方式改进
 */

public class LambdaDemo {
    public static void main(String[] args) {
        // 实现类的方式实现需求
//        MyRunnable mr = new MyRunnable();
//        Thread t1 = new Thread(mr);
//        t1.start();


        // 匿名内部类的方式改进
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程程序启动了");
//            }
//        }).start();


        // lambda表达式的方式改进
        new Thread(() -> {
            System.out.println("多线程程序启动了");
        }).start();
    }
}
