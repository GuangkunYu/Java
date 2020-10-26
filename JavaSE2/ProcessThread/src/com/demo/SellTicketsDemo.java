package com.demo;

/*
    案例：
        卖票
    需求：
        某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票

    线程同步
        同步代码块：
            锁多条语句操作共享数据，可以使用同步代码块实现
            格式：
                synchronized(任意对象){
                    多条语句操作共享数据的代码
                }
            synchronized(任意对象)：相当于给代码枷锁了，任意对象就可以看成是一把锁
        同步的好处和弊端：
            好处：
                解决了多线程的数据安全问题
            弊端：
                当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率

        同步方法：
            格式：
                修饰符 synchronized 返回值类型 方法名(方法参数){}
            同步方法的锁对象是什么呢？
                this
            同步静态方法：
                就是把 synchronized 关键字加到静态方法上
                格式：
                    修饰符 static synchronized 返回值类型 方法名(方法参数){}
                同步静态方法的锁对象是什么？
                    类名.class
 */

public class SellTicketsDemo {
    public static void main(String[] args) {
        SellTickets st = new SellTickets();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
