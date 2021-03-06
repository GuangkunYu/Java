package modifier_grammar;

/*
    状态修饰符：
        final（最终态）：
            final关键字是最终的意思，可以修饰成员方法，成员变量，类
            特点：
                修饰方法：表明该方法是最终方法，不能被重写
                修饰变量：表明该变量时常量，不能再次被赋值
                修饰类：表明该类是最终类，不能被继承
            final修饰局部变量：
                基本类型：final修饰指的是基本类型的数据值不能发生变化
                引用类型：final修饰指的是引用类型的地址值不能发生变化，
                         但是地址里面的内容是可以发生改变的


        static（静态）：
            static关键字是静态的意思，可以修饰成员方法，成员变量
            特点：
                被类的所有对象共享
                    这也是我们判断是否使用静态关键字的条件
                可以通过类名调用
                    当然，也可以通过对象名调用，
                    推荐使用类名调用
            访问特点：
                非静态的成员方法：
                    能访问静态的成员变量
                    能访问非静态的成员变量
                    能访问静态的成员方法
                    能访问非静态的成员方法
                静态的成员方法：
                    能访问静态的成员变量
                    能访问静态的成员方法
                总结：
                    静态成员方法只能访问静态成员
 */

public class StateModifier {
}
