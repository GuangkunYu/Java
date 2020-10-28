package com.lambda_02;

/*
    组成lambda表达式的三要素：
        形式参数、箭头、代码块

    格式：
        (形式参数) -> {代码块}
        形式参数：
            如果有多个参数，参数之间用逗号隔开；如果没有参数，留空即可
        ->：
            固定写法：代表指向动作
        代码块：
            是具体要做的事情，也就是以前写的方法体内容

    lambda表达式的使用前提：
        有一个接口
        接口中有且仅有一个抽象方法

    练习：
        定义一个接口（Eatable），里面定义一个抽象方法：void eat()
        定义一个测试类（EatableDemo），在测试类中提供两个方法：
            一个方法是：useEatable(Eatable e)
            一个方法是主方法，在主方法中调用useEatable方法
 */

public class EatableDemo {
    public static void main(String[] args) {
        // 实现类
        Eatable e = new EatableImpl();
        useEatable(e);

        // 匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });

        // lambda
        useEatable(() -> {
            System.out.println("一天一苹果，医生远离我");
        });
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
