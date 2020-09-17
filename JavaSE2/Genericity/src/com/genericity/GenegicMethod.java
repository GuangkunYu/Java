package com.genericity;

/*
    泛型方法：
        泛型方法的定义格式：
            修饰符 <类型> 返回值类型 方法名(类型 变量名){}
        范例：
            public <T> void show(T t){}
 */

public class GenegicMethod {
    public <T> void show(T t){
        System.out.println(t);
    }
}
