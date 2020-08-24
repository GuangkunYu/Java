package basic_array_method_test;

/*
    需求：
        已知一个数组arr={19,28,37,46,50},键盘录入一个数据，查找该数据在数组中的索引，
        并在控制台输出找到的索引值。
 */

import java.util.Scanner;

public class SearchIndex {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数据：");
        int num = sc.nextInt();

        int ind = searchIndex(arr, num);

        System.out.println("查找的索引为：" + ind);
    }

    public static int searchIndex(int[] arr, int num){
        int index = -1;

        for (int i =0; i<arr.length; i++){
            if (arr[i] == num){
                index = i;
                break;
            }
        }

        return index;
    }
}
