package com.mathapi;

/*
    Math类的常用方法：
            方法名                         说明
        abs(int a)                  返回参数的绝对值
        ceil(double a)              返回大于或等于参数的最小double值，等于一个整数
        floor(double a)             返回小于或等于参数的最大double值，等于一个整数
        round(float a)              按照四舍五入返回最接近参数的int
        max(int a,int b)            返回两个int值中的较大值
        min(int a,int b)            返回两个int值中的较小值
        pow(double a,double b)      返回a的b次幂的值
        random()                    返回值为double的正值，[0.0,1.0)
 */

public class Demo {
    public static void main(String[] args) {
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));

        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));

        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));

        System.out.println(Math.round(12.34F));
        System.out.println(Math.round(12.56F));

        System.out.println(Math.max(66, 88));

        System.out.println(Math.pow(2.0, 3.0));

        System.out.println((int)((Math.random())*100)+1);
    }
}

