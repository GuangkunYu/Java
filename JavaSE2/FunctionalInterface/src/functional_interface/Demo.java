package functional_interface;

/*
    函数式接口：
        有且仅有一个抽象方法的接口
        Java中的函数式编程体现就是lambda表达式，所以函数式接口就是可以适用于lambda使用的接口，只有确保接口中有且只有一个抽象方法，
        Java中的lambda才能顺利进行推导

    如何检测一个接口是不是函数式接口？
        @FunctionalInterface
        放在接口定义的上方：如果接口是函数式接口，编译通过；如果不是，编译失败
 */

public class Demo {
    public static void main(String[] args) {
        MyInterface mi = () -> System.out.println("函数式接口");
        mi.show();
    }
}
