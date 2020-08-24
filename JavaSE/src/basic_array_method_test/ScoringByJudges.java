package basic_array_method_test;

/*
    需求：
        在编程竞赛中，有6个评委为参赛选手打分，分数为0-100的整数分。
        选手的最后得分为：去掉一个最高分和一个最低分后的4个评委平均值（不考虑小数部分）
 */


import java.util.Scanner;

public class ScoringByJudges {
    public static void main(String[] args) {
        int member = 6;
        scoring(member);

    }

    // 打分方法，键盘录入分数，保存到数组中，并输出
    public static void scoring(int mem) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[mem];

        for (int i = 0; i < mem; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委成绩：");
            int score = sc.nextInt();
            scores[i] = score;
        }

        System.out.print("[");
        for (int j = 0; j < scores.length; j++) {
            if (j == scores.length - 1) {
                System.out.print(scores[j]);
            } else {
                System.out.print(scores[j] + ",");
            }
        }
        System.out.println("]");


        moveBigSmall(scores);
    }

    // 去掉最高最低分方法
    public static void moveBigSmall(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max + "---" + min);

        aver(arr, max, min);
    }

    // 求平均值的方法
    public static void aver(int[] arr, int max, int min) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == max || arr[j] == min) {
                continue;
            }
            sum += arr[j];
        }
        int avery = sum / (arr.length - 2);
        System.out.println("去掉一个最高分去掉一个最低分，最后得分是：" + avery + "分");
    }
}
