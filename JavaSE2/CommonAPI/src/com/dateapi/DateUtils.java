package com.dateapi;
/*
    案例：日期工具类
    需求：
        定义一个日期工具类（DateUtils），包含两个方法：
        把日期转换为指定格式的字符串；
        把字符串解析为指定格式的日期。
        然后定义一个测试类，测试日期工具类的方法
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public DateUtils() {
    }

    public static String dateToString(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }

    public static Date stringToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;
    }
}
