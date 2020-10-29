package common_method_inter.Function;

/*
    Function接口
        Function<T,R>：常用的方法：
            R	apply​(T t)	将此函数应用于给定的参数。
            default <V> Function<T,​V>	andThen​(Function<? super R,​? extends V> after)	：
                    返回首先将此函数应用于其输入的 after函数，然后将 after函数应用于结果。
            该接口通常用语对参数进行处理，转换（处理逻辑由lambda表达式实现），然后返回一个新的值
 */

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convert("100", s -> Integer.parseInt(s));

        convert(100, i -> String.valueOf(i + 566));

        convert("100",
                s -> Integer.parseInt(s),
                i -> String.valueOf(i + 566)
        );
    }

    // 定义一个方法，把一个字符串转换int类型，在控制台输出
    private static void convert(String s, Function<String, Integer> fun) {
        Integer it = fun.apply(s);
        System.out.println(it);
    }

    // 定义一个方法，把一个int类型的数据加上一个整数之后，转换字符串类型，在控制台输出
    private static void convert(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    // 定义一个方法，把一个字符串转换int类型，把int类型的数据加上一个整数之后，转为字符串在控制台输出
    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String str = fun1.andThen(fun2).apply(s);
        System.out.println(str);
    }
}
