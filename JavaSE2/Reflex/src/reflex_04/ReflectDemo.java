package reflex_04;

/*
    反射获取成员方法并使用
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取class对象
        Class<?> c = Class.forName("reflex_01.Student");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        // 方法[]	getMethods()
        //返回一个包含 方法对象的数组， 方法对象反映此 类对象所表示的类或接口的所有公共方法，
        // 包括由类或接口声明的那些以及从超类和超接口继承的那些。
//        Method[] methods = c.getMethods();
        // 方法[]	getDeclaredMethods()
        //返回一个包含 方法对象的数组， 方法对象反映此 类对象表示的类或接口的所有已声明方法，
        // 包括public，protected，default（package）访问和私有方法，但不包括继承的方法。
//        Method[] declaredMethods = c.getDeclaredMethods();
//        for (Method method: declaredMethods){
//            System.out.println(method);
//        }

        // 方法	getMethod​(String name, 类<?>... parameterTypes)
        //返回 方法对象，该对象反映此 类对象表示的类或接口的指定公共成员方法。
        // 方法	getDeclaredMethod​(String name, 类<?>... parameterTypes)
        //返回 方法对象，该对象反映此 类对象表示的类或接口的指定声明方法。
        Method method1 = c.getMethod("method1");
        Method method2 = c.getMethod("method2", String.class);

        method1.invoke(obj);
        method2.invoke(obj, "helloworld");
    }
}
