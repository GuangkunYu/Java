package com.objectapi;

/*
    equals(Object obj)
        比较对象是否相等。默认比较地址，重写可以比较内容，自动生成
 */
public class EqualsDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(30);

        Student s2 = new Student();
        s2.setName("张三");
        s2.setAge(30);

        // 需求：比较两个对象内容是否相同
//        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
