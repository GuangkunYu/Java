package com.dateapi;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsTest {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        String s1 = DateUtils.dateToString(d, "yyyy-MM-dd HH:mm:ss");
        System.out.println(s1);

        Date d1 = DateUtils.stringToDate("2020-08-31 19:22:50", "yyyy-MM-dd HH:mm:ss");
        System.out.println(d1);
    }
}
