package reflex_03;

/*
    反射获取成员变量并使用：

 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取Class对象
        Class<?> c = Class.forName("reflex_01.Student");

        // 字段[]	getFields()
        //返回一个包含 字段对象的数组， 字段对象反映此 类对象所表示的类或接口的所有可访问公共字段。
        Field[] fs = c.getFields();
        for (Field f:fs){
            System.out.println(f);
        }
        System.out.println("----------------");
        // 字段[]	getDeclaredFields()
        //返回 字段对象的数组， 字段对象反映由此 类对象表示的类或接口声明的所有字段。
        Field[] dfs = c.getDeclaredFields();
        for (Field f: dfs){
            System.out.println(f);
        }
        System.out.println("----------------");

        // 字段	getField​(String name)
        //返回 字段对象，该对象反映此 类对象表示的类或接口的指定公共成员字段。
        Field address = c.getField("address");

        // 无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        address.set(obj, "西安");
        System.out.println(obj);
        System.out.println("----------------");

        // 字段	getDeclaredField​(String name)
        //返回 字段对象，该对象反映此 类对象表示的类或接口的指定声明字段。
        Field name = c.getDeclaredField("name");
        System.out.println(name);
    }
}
