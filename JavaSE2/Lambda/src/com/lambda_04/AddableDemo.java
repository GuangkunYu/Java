package com.lambda_04;

/*
    练习：
        定义一个接口（Addable），里面定义一个抽象方法：int add(int x, int y);
        定义一个测试类AddableDemo，在测试类中提供两个方法：
            一个是：useAddable(Addable a)
            一个是主方法，在主方法中调用useAddable方法
 */

public class AddableDemo {
    public static void main(String[] args) {
        // 实现类
        Addable a = new AddableImpl();
        useAddable(a);
        System.out.println("---------------------");

        // 匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });
        System.out.println("---------------------");

        // lambda
        useAddable((x, y) -> {
            return x + y;
        });

    }

    private static void useAddable(Addable a) {
        int sum;
        sum = a.add(4, 5);
        System.out.println("和是：" + sum);
    }
}
