package com.calendarapi;

/*
    Calendar类：
        Calendar为某一时刻和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法

        Calendar提供了一个类方法getInstance用于获取Calendar对象，其日历字段已使用当前日期和
        时间初始化：Calendar rightNow = Calendar.getInstance();
 */

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
