package Interface.InterDefault_01;

/*
    接口中默认方法：
        接口中默认方法的定义格式：
            格式：
                public default 返回值类型 方法名(参数列表) {}
            范例：
                public default void show3() {}

        接口中默认方法的注意事项：
            默认方法不是抽象方法，所以不强制被重写。但是可以被重写，重写的时候去掉default关键字
            public可以省略，default不能省略

    需求：
        1.定义一个接口MyInterface，里面有两个抽象方法：
            void show1();
            void show2();
        2.定义接口的两个实现类
            MyInterfaceImplOne
            MyInterfaceImplTwo
        3.定义测试类：
            MyInterfaceDemo
            在主方法中，按照多态的方式创建对象并使用
 */

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface mio = new MyInterfaceImplOne();
        mio.show1();
        mio.show2();
        mio.show3();
    }
}
