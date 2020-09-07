package com.set;

/*
    哈希值：
        是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值

    Object类中有一个方法可以获取对象的哈希值：
        hashCode(): 返回对象的哈希码值

    对象的哈希值特点：
        同一个对象多次调用hashCode()方法返回的哈希值是相同的
        默认情况下，不同对象的哈希值是不同的。
        而重写hashCode()方法，可以实现让不同对象的哈希值相同
 */

public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 15);

        // 同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("---------------");

        // 默认情况下，不同对象的哈希值是不相同的
        // 通过方法重写，可以实现不同对象的哈希值是相同的
        Student s2 = new Student("张三", 15);
        System.out.println(s2.hashCode());

        System.out.println("hello".hashCode()); //99162322
        System.out.println("world".hashCode()); //113318802
        System.out.println("java".hashCode());  //3254818

        System.out.println("--------------------");
        System.out.println("中国".hashCode());
        System.out.println("你好".hashCode());
    }
}
