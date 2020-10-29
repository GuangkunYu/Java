package common_method_inter.Function;

/*
    练习：
        String s = "凌青霞,30";
        请按照指定的要求进行操作：
            1.将字符串截取得到数字年龄部分
            2.将上一步的年龄字符串转换成为int类型的数据
            3.将上一步的int数据加70，得到一个int结果，在控制台输出
        请通过Function接口来实现函数拼接
 */

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String s = "凌青霞,30";
        myFun(
                s,
                s1 -> s1.split(",")[1],
                s1 -> Integer.parseInt(s1),
                i -> i + 70
        );
    }

    private static void myFun(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        Integer i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);
    }
}
