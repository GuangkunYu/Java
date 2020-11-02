package reflex_02;

/*
    反射获取构造方法并使用：

 */

import java.lang.reflect.Constructor;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        // 获取Class对象
        Class<?> c = Class.forName("reflex_01.Student");

//        构造器<?>[]	getConstructors() 返回一个包含 构造器对象的数组， 构造器对象反映了此 类对象所表示的类的所有公共构造函数。
//        Constructor<?>[] cons = c.getConstructors();

        // 构造器<?>[]	getDeclaredConstructors()返回 构造器对象的数组， 构造器对象反映由此 类对象表示的类声明的所有构造函数
        Constructor<?>[] cons = c.getDeclaredConstructors();
        for (Constructor con: cons){
            System.out.println(con);
        }
        System.out.println("-----------------------------");


     // 构造器<T> getConstructor​(类<?>... parameterTypes)返回一个构造器对象，该对象反映此类对象所表示的类的指定公共构造函数。
        Constructor<?> con = c.getConstructor();

        // T	newInstance​(Object... initargs)
        //使用此 构造器对象表示的构造方法，使用指定的初始化参数创建和初始化构造函数声明类的新实例。
        Object obj = c.newInstance();
        System.out.println(obj);

        // 构造器<T> getDeclaredConstructor​(类<?>... parameterTypes)返回一个构造器对象，
        // 该对象反映此类对象所表示的类或接口的指定构造函数。
        // 参数：要获取的构造方法的参数的个数和数据类型对应得字节码文件对象
    }
}
