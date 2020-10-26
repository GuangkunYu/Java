package com.demo;

public class SellTickets implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        boolean flag = true;

        while (flag){
            synchronized (obj){
                if (tickets > 0){
                    // 通过sleep 方法模拟出票时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第 " +tickets+" 张票");
                    tickets --;
                }
            }
        }
    }
}
