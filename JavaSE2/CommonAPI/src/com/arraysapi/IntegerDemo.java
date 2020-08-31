package com.arraysapi;

/*
    基本类型包装类：
        将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
        常见的操作之一：
            用于基本数据类型与字符串之间的转换

        基本数据类型      包装类
          byte           Byte
          short          Short
          int            Integer
          long           Long
          float          Float
          double         Double
          char           Character
          boolean        Boolean

    Integer类：
        包装一个对象中的原始类型int的值

        方法名                 说明
        valueOf(int i)      返回表示指定的int值的Integer实例
        valueOf(String s)   返回一个保存指定值的Integer对象String
 */

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);

    }
}
