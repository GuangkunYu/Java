package com.exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try{
            t.checkScore(score);
        }catch (CustomException e){
            e.printStackTrace();
        }
    }
}
