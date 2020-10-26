package com.lock;

/*
    Lock锁：
        提供比使用synchronized方法和语句可以获得更加广泛的锁定操作

        Lock中提供了获得锁和释放锁的方法：
            void lock():
                获得锁
            void unlock():
                释放锁

        Lock是接口不能直接实例化，采用它的实现类ReentrantLock来实例化
            ReentrantLock的构造方法：
                ReentrantLock()：
                    创建一个ReentrantLock的实例

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
