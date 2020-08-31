package com.dateapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    SimpleDateFormatDemo类：
        是一个具体的类，用于以区域设置敏感的方式格式化和解析日期。

        日期和时间格式由日期和时间模式字符串指定，在日期和时间模式字符串中，从‘A’到‘Z’以及从
        ‘a’到‘z’引号的字母被解释为表示日期或时间字符串的组件的模式字母

        常用的模式字母以及对应关系如下：
            y   年
            M   月
            d   日
            H   时
            m   分
            s   秒

        构造方法：
            SimpleDateFormat()                  构造一个SimpleDateFormat，使用默认模式和日期格式
            SimpleDateFormat(String pattern)    构造一个SimpleDateFormat使用给定的模式和默认的日期格式

        格式化和解析日期：
            格式化（从Date到String）
                format(Date date)：将日期格式化成日期/时间字符串
            解析（从String到Date）
                parse(String source)：从给定字符串的开始解析文本以生成日期

 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("----------------");


        String date = "2020-02-20 20:20:20";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(date);
        System.out.println(dd);
    }
}
