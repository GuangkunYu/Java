package com.arraysapi;

/*
    基本类型包装类：
        自动装箱和拆箱：
            装箱：把基本数据类型转换为对应的包装类类型
            拆箱：把包装类类型转换为对应的基本数据类型

        注意：
            在使用包装类类型的时候，如果做操作，最好先判断是否为null，
            推荐：
                只要是对象，在使用前就必须进行不为null的判断
 */

public class BoxingUnboxingDemo {
    public static void main(String[] args) {
//        装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);   // 装箱
        Integer ii = 100;   // 自动装箱-->Integer.valueOf(100);


//        拆箱：把包装类类型转换为对应的基本数据类型
        ii = ii.intValue() + 200;   // 拆箱
        ii += 200;      // 自动拆箱
        System.out.println(ii);
    }
}
