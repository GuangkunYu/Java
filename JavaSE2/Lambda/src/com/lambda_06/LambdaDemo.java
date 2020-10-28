package com.lambda_06;

/*
    lambda表达式的注意事项：
        使用lambda必须要有接口，并且要求接口中有且仅有一个抽象方法
        必须要有上下文环境，才能推导出lambda对应的接口：
            根据局部变量的赋值得知lambda对应得接口：
                Runnable r = () -> System.out.println("lambda表达式");
            根据调用方法的参数得知lambda对应得接口：
                new Thread(() -> System.out.println("lambda表达式")).start();
 */

public class LambdaDemo {
    public static void main(String[] args) {
        useInter( () -> System.out.println("好好学习，天天向上"));

        new Thread(() -> System.out.println("lambda表达式")).start();
    }

    private static void useInter(Inter i){
        i.show();
    }
}
