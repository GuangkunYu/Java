package com.dateapi;

import java.util.Date;

/*
    Date类的常用方法：
          方法名                 说明
        getTime()           获取的是日期对象从1970年1月1日00:00:00到现在的毫秒值
        setTime(long time)  设置时间，给的是毫秒值
 */
public class DateMethodDemo {
    public static void main(String[] args) {
        Date d = new Date();

//        System.out.println(d.getTime());
//        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

//        long time = 1000*60*60;
        long time = System.currentTimeMillis();

        d.setTime(time);
        System.out.println(d);
    }
}
