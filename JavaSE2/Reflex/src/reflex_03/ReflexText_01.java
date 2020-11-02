package reflex_03;

/*
    反射获取成员变量并使用练习
        通过反射实现如下操作：
            Student s = new Student();
            s.name = "凌青霞";
            s.age = 30;
            s.address  = "西安";
            System.out.println(s);
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflexText_01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // 获取Class类对象
        Class<?> c = Class.forName("reflex_01.Student");

        // 获取无参构造方法 , 并创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        // 获取成员变量
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj, "凌青霞");
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(obj, 30);
        Field address = c.getField("address");
        address.set(obj, "西安");
        System.out.println(obj);

    }
}
