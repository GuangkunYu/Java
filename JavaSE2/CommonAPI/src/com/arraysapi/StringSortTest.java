package com.arraysapi;

/*
    字符串中数据排序：
        需求：
            有一个字符串："91 27 46 38 50"，请写程序实现最终输出结果是："27 38 46 50 91"
 */

import java.util.Arrays;

public class StringSortTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        // 定义一个字符数组接收字符串切割之后的值
        String[] strArrays = s.split(" ");
//        for (int i = 0; i<strArrays.length; i++){
//            System.out.println(strArrays[i]);
//        }
        // 定义一个int数组，长度为字符数组长度
        int[] intArrays = new int[strArrays.length];
        for (int i = 0; i < strArrays.length; i++) {
            // 将字符数组的元素加入到int数组中
            intArrays[i] = Integer.parseInt(strArrays[i]);
        }
//        for (int j = 0; j < intArrays.length; j++) {
//            System.out.println(intArrays[j]);
//        }
        // 给int数组元素进行排序
        Arrays.sort(intArrays);

        // 创建一个stringbuilder用来保存数组元素到字符串
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < intArrays.length; j++) {
            if (j == intArrays.length-1){
                sb.append(intArrays[j]);
            }else {
                sb.append(intArrays[j]).append(" ");
            }
        }
        // 将stringbuilder转换为字符串
        String result = sb.toString();
        System.out.println(result);
    }
}
