package com.arraysapi;

/*
    冒泡排序：
        排序：将一组数据按照固定的规则进行排列
        冒泡排序：
            一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，
            依次对所有的数据进行操作，直至所有数据按要求完成排序

            如果有N个数据进行排序，总共需要比较N-1次
            每一次比较完毕，下一次的比较就会少一个数据参与
 */



public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] a = new int[]{19, 34, 42, 55, 12, 23, 64, 14, 56};
        for (int i = 0; i< a.length-1; i++){
            for (int j = 0; j< a.length-i-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("[");
        for (int t = 0; t <= a.length-1; t++){
            if (t == a.length -1){
                System.out.print(a[t]);
            }else {
                System.out.print(a[t] + ", ");
            }

        }
        System.out.println("]");
    }
}
