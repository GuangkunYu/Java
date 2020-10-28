package com.lambda_05;

/*
    lambda表达式的省略模式：

 */

public class LambdaDemo {
    public static void main(String[] args) {
        useAddable((int x, int y) -> {
            return x + y;
        });
        System.out.println("------------------------");

        // 参数的类型可以省略,但是有多个参数的情况下，不能只能省略一个
        useAddable((x, y) -> {
            return x + y;
        });
        System.out.println("------------------------");

        useFlyable((String s) -> {
            System.out.println(s);
        });
        System.out.println("------------------------");

        // 如果参数有且只有一个，那么小括号可以省略
        useFlyable(s -> {
            System.out.println(s);
        });
        System.out.println("------------------------");

        // 如果代码块的语句只有一条，可以省略大括号和分号，如果有return，return也要省略掉
        useFlyable(s -> System.out.println(s));
        System.out.println("------------------------");

        useAddable((x, y) -> x + y);
        System.out.println("------------------------");
    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println("和是：" + sum);
    }
}
