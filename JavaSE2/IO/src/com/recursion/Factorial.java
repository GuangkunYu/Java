package com.recursion;

/*
    案例：递归求阶乘
    需求：用递归求5的阶乘，
 */

public class Factorial {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int n){
        if (n == 1){
            return 1;
        }else{
            return n * f(n-1);
        }
    }
}
