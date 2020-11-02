package reflex_02;

/*
    反射获取构造方法并使用练习：
        2：通过反射实现如下操作：
            Student s = new Student("凌青霞");
            System.out.println(s);
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflexTest_02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 获取class对象
        Class<?> c = Class.forName("reflex_01.Student");

        // 获取带一个参数的构造方法
        // 基本数据类型也可以通过.class得到对应得Class类型
        Constructor<?> con = c.getDeclaredConstructor(String.class);

        // 暴力反射  值为true，取消访问检查
        con.setAccessible(true);

        // 创建对象
        Object obj = con.newInstance("凌青霞");
        System.out.println(obj);

    }
}
