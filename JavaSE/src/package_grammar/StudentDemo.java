package package_grammar;

/*
    学生测试类

    private关键字：
        是一个权限修饰符
        可以修饰成员（成员变量和成员方法）
        作用是保护成员不被别的类使用，被private修饰的成员只在本类中才能访问

    针对private修饰的成员变量，如果需要被其他类使用，提供相应的操作：
        提供  get变量名()  方法，用于获取成员变量的值，方法用public修饰
        提供  set变量名(参数)  方法，用于设置成员变量的值，方法用public修饰

    private关键字的使用：
        一个标准类的编写：
            把成员变量用private修饰
            提供对应的getXxx()/setXxx()方法

    封装：
        概述：
            是面向对象的三大特征之一（封装、继承、多态）
            是面向对象编程语言对客观世界的模拟，客观世界里成员变量都是隐藏在对象内部的，外界无法直接操作
        封装原理：
            将类的某些信息隐藏在类内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏信息的
            操作和访问成员变量private，提供对应的getXxx()/setXxx()方法
        封装的好处：
            通过方法来控制成员变量的操作，提高了代码的安全性
            把代码用方法进行封装，提高了代码的复用性

 */

public class StudentDemo {
    public static void main(String[] args) {
        // 创建对象
        Student s = new Student();

        // 给成员变量赋值
        s.setName("张三");
        s.setAge(19);

        // 调用show方法
        s.show();

        // 使用get方法获取成员变量的值
        System.out.println(s.getName() + "--" + s.getAge());
    }
}
