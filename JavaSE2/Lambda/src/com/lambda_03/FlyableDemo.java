package com.lambda_03;

/*
    lambda表达式的使用：
        练习：
            定义一个接口（Flyable），里面定义一个抽象方法：void fly(String s);
            定义一个测试类FlyableDemo，在测试类中提供两个方法：
                一个方法是：useFlyable(Flyable f)
                一个是主方法，在主方法中调用useFlyable方法
 */

public class FlyableDemo {
    public static void main(String[] args) {
        // 实现类
        Flyable fly = new FlyableImpl();
        useFlyable(fly);
        System.out.println("---------------------");

        // 匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
        System.out.println("---------------------");

        // lambda
        useFlyable((String s) -> {
            System.out.println(s);
            System.out.println("飞机自驾游");
        });
    }

    private static void useFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
    }
}
