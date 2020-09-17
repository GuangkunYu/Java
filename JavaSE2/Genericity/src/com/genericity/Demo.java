package com.genericity;

/*
    泛型：
        提供了编译时类型安全检测机制，该机制允许在编译时检测到非法的类型
        本质是参数化类型，也就是说所操作的数据类型被指定为一个参数

        参数化类型：就是将类型由原来的具体的类型参数化，然后在使用/调用时传入具体的类型
        这种参数类型可以用在类、方法和接口中，分别被称为泛型类、泛型方法、泛型接口

    泛型定义格式：
        <类型>：
            指定一种类型的格式。这里的类型可以看成是形参
        <类型1，类型2...>：
            指定多种类型的格式，多种类型之间用逗号隔开。这里的类型可以看成是形参
        将来具体调用时候给定的类型可以看成是实参，并且实参的类型只能是引用数据类型

    泛型的好处：
        把运行期间的问题提前到了编译期间
        避免了强制类型转换

    泛型类：
        格式：
            修饰符 class 类名<类型>{}
        范例：
            public class Generic<T>{}
            此处T可以随便写为任意标识，常见的如T\E\K\V等形式的参数常用于表示泛型

 */

public class Demo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        System.out.println(stu.getName());

        Teacher tea = new Teacher();
        tea.setAge(30);
        System.out.println(tea.getAge());

        System.out.println("----------------");

        Generic<String> gs = new Generic<>();
        gs.setT("李四");
        System.out.println(gs.getT());

        Generic<Integer> gi = new Generic<>();
        gi.setT(20);
        System.out.println(gi.getT());
    }
}
