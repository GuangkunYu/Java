package reflex_04;

/*
    反射获取成员方法并使用练习：
        通过反射实现如下操作：
            Student s = new Student();
            s.method1();
            s.method2("凌青霞");
            String ss = s.method3("凌青霞",30);
            System.out.println(ss);
            s.function();
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflexTest_01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取class对象
        Class<?> c = Class.forName("reflex_01.Student");

        // 获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        // 调用method1
        Method m1 = c.getMethod("method1");
        m1.invoke(obj);

        // 调用method2
        Method m2 = c.getMethod("method2", String.class);
        m2.invoke(obj, "凌青霞");

        // 调用method3
        Method m3 = c.getMethod("method3", String.class, int.class);
        String ss = (String) m3.invoke(obj, "凌青霞", 30);
        System.out.println(ss);

        Method fun = c.getDeclaredMethod("function");
        fun.setAccessible(true);
        fun.invoke(obj);
    }
}
