package reflex_05;

/*
    反射练习：
        1，有一个ArrayList<Integer>集合，现在我想在这个集合中添加一个字符串数据，如何实现？
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflexText_01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 创建集合
        ArrayList<Integer> array = new ArrayList<>();

        array.add(10);
        array.add(20);
        array.add(30);
        System.out.println(array);

        // 获取class对象
        Class<? extends ArrayList> c = array.getClass();
        Method myAdd = c.getMethod("add", Object.class);

        Object add1 = myAdd.invoke(array, "hello");
        Object add2 = myAdd.invoke(array, "world");

        System.out.println(array);
    }
}
