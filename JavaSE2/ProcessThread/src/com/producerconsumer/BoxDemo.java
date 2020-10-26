package com.producerconsumer;

/*
    生产者消费者模式：
        等待和唤醒方法：
            void wait():
                导致当前线程等待，直到另一个线程调用该对象的notify()方法或notifyAll()方法
            void notify():
                唤醒正在等待对象监视器的单个线程
            void notifyAll():
                唤醒正在等待对象监视器的所有线程


     案例：
        生产者消费者案例：
            包含的类：
                奶箱类（Box）：定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
                生产者类（Producer）：实现Runnable接口，重写run()方法，调用存储牛奶的操作
                消费者类（Customer）：实现Runnable接口，重写run()方法，调用获取牛奶的操作
                测试类（BoxDemo）：里面有main方法,main方法步骤如下：
                    创建奶箱对象，这里共享数据区域
                    创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用存储牛奶的操作
                    创建消费者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用获取牛奶的操作
                    创建2个线程对象，分别把生产者对象和消费者对象作为构造方法的参数传递
                    启动线程
 */

public class BoxDemo {
    public static void main(String[] args) {
        // 创建奶箱对象，这里共享数据区域
        Box b = new Box();

        // 创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用存储牛奶的操作
        Producer p = new Producer(b);

        // 创建消费者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用获取牛奶的操作
        Customer c = new Customer(b);

        // 创建2个线程对象，分别把生产者对象和消费者对象作为构造方法的参数传递
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }
}
