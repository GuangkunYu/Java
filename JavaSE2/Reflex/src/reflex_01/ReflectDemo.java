package reflex_01;

/*
     反射：
        是指在运行时去获取一个类的变量和方法信息。然后通过获取到的信息来创建对象，调用方法的一种机制。
        由于这种动态性，可以极大的增强程序的灵活性，程序不用再编译期就完成确定，在运行期仍然可以扩展。

    获取Class类的对象：
        想通过反射去使用一个类，首先要获取到该类的字节码文件对象，也就是类型为class类型的对象
        三种方式获取Class类型的对象：
            1. 使用类的class属性来获取该类对应得Class对象
                举例：Student.class将返回Student类对应得Class对象
            2.调用对象的getClass()方法，返回该对象所属类对应得Class对象
                该方法是Object类中的方法，所有的java对象都可以调用该方法
            3.使用Class类中的静态方法forName(String className),该方法需要传入字符串参数，该字符串参数的值是某个类的全路径，
                也就是完整包名的路径
 */

import java.sql.SQLOutput;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 使用类的class属性来获取该类对应得Class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);
        System.out.println("---------------------------------");

        // 调用对象的getClass()方法，返回该对象所属类对应得Class对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3 == c1);
        System.out.println("---------------------------------");

        // 使用Class类中的静态方法forName(String className)
        Class<?> c4 = Class.forName("reflex_01.Student");
        System.out.println(c1 == c4);
    }
}
