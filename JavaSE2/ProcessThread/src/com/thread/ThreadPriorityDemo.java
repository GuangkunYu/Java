package com.thread;

/*
    线程调度：
        分时调度模式：
            所有线程轮流使用CPU的使用权，平均分配每个线程占用CPU的时间片
        抢占式调度模式：
            优先让优先级高的线程使用CPU，如果线程的优先级相同，那么会随机选择一个，优先级高的线程获取的CPU时间片相对多一些

    Java使用的是抢占式调度模型
    多线程程序的执行是有随机性的

    Thread类中设置和获取线程优先级的方法：
        public final int getPriority():
            返回此线程的优先级
        public final void setPriority(int newPriority):
            更改此线程的优先级

        线程默认优先级是5，线程优先级的范围是1-10
        线程优先级高仅仅表示线程获取的CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到想要的效果
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

//        public final int getPriority():返回此线程的优先级
//        System.out.println(tp1.getPriority());  //5
//        System.out.println(tp2.getPriority());  //5
//        System.out.println(tp3.getPriority());  //5

//        System.out.println(Thread.MIN_PRIORITY);    //1
//        System.out.println(Thread.MAX_PRIORITY);    //10
//        System.out.println(Thread.NORM_PRIORITY);   //5

        // 设置正确的优先级
        tp1.setPriority(5);
        tp1.setPriority(10);
        tp1.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
