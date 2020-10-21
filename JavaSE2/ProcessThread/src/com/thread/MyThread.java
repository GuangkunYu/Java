package com.thread;

//多线程的实现方式：
//        方式1：继承Thread类
//          定义一个类MyThread继承Thread类
//          在MyThread类中重写run()方法
//          创建MyThread类的对象
//          启动线程
/*
    设置和获取线程名称：
                void setName(String name)：将此线程的名称更改为等于参数name
                String getName()：返回此线程的名称
 */

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            System.out.println(getName() +": "+i);
        }
    }
}
