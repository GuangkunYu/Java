package com.arraysapi;

/*
    Arrays类：
        包含用于操作数组的各种方法

        toString(int[] a)   返回指定数组的内容的字符串表示形式
        sort(int[] a)       按照数字顺序排列指定的数组


    工具类的设计思想：
        构造方法用private修饰
        成员用public static修饰
 */

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {24, 68, 59, 36, 17};

        System.out.println("排序前：" + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
