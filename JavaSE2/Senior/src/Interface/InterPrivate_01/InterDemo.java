package Interface.InterPrivate_01;

/*
    接口中私有方法的定义格式：
        格式1：
            private 返回值类型 方法名(参数列表) {}
        范例1：
            private void show() {}
        格式2：
            private static 返回值类型 方法名(参数列表) {}
        范例2：
            private static void method() {}

    接口中私有方法的注意事项：
        默认方法可以调用私有的静态方法和非静态方法
        静态方法只能调用私有的静态方法

    需求：
        1. 定义一个接口Inter，里面有四个方法：二个默认方法，两个静态方法
            default void show1() {}
            default void show2() {}
            static void method1() {}
            static void method2() {}
        2.定义接口的一个实现类
            InterImpl
        3.定义测试类
            InterDemo
            在主方法中，按照多态的方式创建对象并使用
 */

public class InterDemo {
    public static void main(String[] args) {
        Inter in = new InterImpl();
        in.show1();
        System.out.println("-----------------------");
        in.show2();
        System.out.println("-----------------------");
        Inter.method1();
        System.out.println("-----------------------");
        Inter.method2();

    }
}
