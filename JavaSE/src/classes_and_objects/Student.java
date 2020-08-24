package classes_and_objects;
/*
    需求：
        首先定义一个学生类，然后定义一个学生测试类，在学生测试类中通过对象完成成员变量
        和成员方法的使用
 */

public class Student {
    // 成员变量
    String name;
    int age;

    // 成员方法
    public void study(){
        // 局部变量
        int i = 0;
        System.out.println("学习");
    }
    public void doHomework(){
        System.out.println("做家庭作业");
    }
}

/*
    成员变量和局部变量区别：

        区别              成员变量                局部变量
    类中位置不同          类中方法外           方法内或者方法申明上
    内存中位置不同         堆内存                 栈内存
    生命周期不同          随着对象的存在而存在     随着方法的调用而存在
                        随着对象的消失而消失      随着方法的调用完毕而消失
    初始化值不同          有默认的初识化值        没有默认的初始化值，必须先定义，赋值，才能使用
 */


















