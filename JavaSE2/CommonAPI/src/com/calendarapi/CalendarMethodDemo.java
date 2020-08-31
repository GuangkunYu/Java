package com.calendarapi;
/*
    Calendar类常用方法：
        get(int field)                      返回给定日历字段的值
        add(int field, int amount)          根据日历的规则，将指定的时间量添加或减去给定的日历字段
        set(int year, int month, int date)  设置当前日历的年月日
 */

import java.util.Calendar;

public class CalendarMethodDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");
        // 3年前的今天
//        c.add(Calendar.YEAR, -3);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        // 10年后的5天前
//        c.add(Calendar.YEAR, 10);
//        c.add(Calendar.DATE, -5);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        c.set(2048, 11, 11);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
