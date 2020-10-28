package Interface.InterStatic_01;

/*
    接口中静态方法：
        接口中静态方法的定义格式：
            格式：
                public static 返回值类型 方法名(参数列表) {}
            范例：
                public static void show() {}

    接口中静态方法的注意事项：
        静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
        public可以省略，static不能省略

    需求：
        1.定义一个接口Inter，里面有三个方法：一个是抽象方法，一个是默认方法,一个是静态方法
            void show();
            default void method() {}
            public static void test() {}
        2.定义接口的一个实现类：
            InterImpl
        3.定义测试类：
            InterDemo
            在主方法中，按照多态的方式创建对象并使用
 */

public class InterDemo {
    public static void main(String[] args) {
        Inter ii = new InterImpl();
        ii.show();
        ii.method();
        Inter.test();
//        ii.test();
    }
}
