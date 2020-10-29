package common_method_inter.Predicate;

/*
    Predicate接口：
        Predicate<T>:常用的四个方法：
            boolean	test​(T t)	根据给定的参数计算此谓词。
            default Predicate<T>	negate()	返回表示此谓词的逻辑否定的谓词。
            default Predicate<T>	and​(Predicate<? super T> other)	返回一个组合谓词，表示此谓词和另一个谓词的短路逻辑AND。
            default Predicate<T>	or​(Predicate<? super T> other)	   返回一个组合谓词，表示此谓词与另一个谓词的短路逻辑OR。
        该接口通常用于判断参数是否满足指定的条件
 */

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
//        boolean b1 = checkString("hello", s -> s.length() > 8);
//        System.out.println(b1);
//        boolean b2 = checkString("helloworld", s -> s.length() > 8);
//        System.out.println(b2);

        boolean b1 = checkString(
                "hello",
                s -> s.length() > 8,
                s -> s.length() < 15
        );
        System.out.println(b1);
        boolean b2 = checkString(
                "helloworld",
                s -> s.length() > 8,
                s -> s.length() < 15
        );
        System.out.println(b2);
    }

    // 判断给定的字符串是否满足要求 test​(T t)   negate()
    private static boolean checkString(String s, Predicate<String> pre) {
//        return pre.test(s);
        return pre.negate().test(s);
    }

    // 判断给定的字符串是否满足要求 and    or
    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.and(pre2).test(s);
        return pre1.or(pre2).test(s);
    }
}
