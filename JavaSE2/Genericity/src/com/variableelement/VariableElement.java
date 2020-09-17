package com.variableelement;

/*
    可变参数：
        可变参数又称参数个数可变，用作方法的形参出现，那么方法参数个数就是可变的了
        - 格式：
            修饰符 返回值类型 方法名(数据类型... 变量名){}
        - 范例：
            public static int sum(int... a){}
 */

public class VariableElement {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }

    public static int sum(int... i){
        int sum = 0;
        for (int in: i){
            sum += in;
        }
        return sum;
    }

//    private static int sum(int i, int i1) {
//        return i + i1;
//    }
//
//    private static int sum(int i, int i1, int i2) {
//        return i + i1 + i2;
//    }
//
//    private static int sum(int i, int i1, int i2, int i3) {
//        return i + i1 + i2 + i3;
//    }
}
