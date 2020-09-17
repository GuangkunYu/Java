package com.recursion;

/*
    递归：
        以编程的角度来看，递归指的是方法定义中调用方法本身的现象

    递归解决问题的思路：
        把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解
        递归策略只需少量的程序就可以描述出解题过程所需要的多次重复计算

    递归解决问题要找到两个内容：
        递归出口：否则会出现内存溢出
        递归规则：与原问题相似的规模较小的问题
 */

public class RecursionDemo {
    public static void main(String[] args) {
        // 回顾不死兔神的问题，求第20个月兔子的对数
        // 每个月的兔子对数：1，1,2,3,5,8，...
//        int[] arr = new int[20];
//
//        arr[0] = 1;
//        arr[1] = 1;

//        for (int i =2; i<arr.length; i++){
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//        System.out.println(arr[19]);

        System.out.println(f(20));
    }

    /*
        递归解决问题，首先就是要定义一个方法：
            定义一个方法f(n):表示第n个月的兔子对数
            那么，第n-1个月的兔子对数该如何表示呢？f(n-1)
            同理，第n-2个月的兔子对数该如何表示呢？f(n-2)
     */
    public static int f(int n){
        if (n == 1 || n==2){
            return 1;
        }else {
            return f(n-1) + f(n-2);
        }
    }
}
