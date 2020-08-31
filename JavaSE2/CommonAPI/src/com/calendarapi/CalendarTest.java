package com.calendarapi;

/*
    案例：二月天
    需求：获取任意一年的二月有多少天
 */

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入年份：");
        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();

        c.set(year, 2, 1);

        c.add(Calendar.DATE, -1);

        int i = c.get(Calendar.DATE);
        System.out.println(year + "年2月份有" + i + "天");
    }
}
