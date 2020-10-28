package com.lambda_03;

public class FlyableImpl implements Flyable {
    @Override
    public void fly(String s) {
        System.out.println(s);
        System.out.println("飞机自驾游");
    }
}
