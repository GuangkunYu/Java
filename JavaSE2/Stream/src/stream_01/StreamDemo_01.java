package stream_01;

/*
    体验Stream流：
        需求：按照下面的要求完成集合的创建和遍历
            1.创建一个集合，存储多个字符串元素
            2.把集合中所有以“张”开头的元素存储到一个新的集合
            3.把“张”开头的集合中的长度为3的元素存储到一个新的集合

        使用Stream流的方式完成过滤操作：
            list.stream().filter( s -> s.startsWith("张")).filter( s-> s.length() == 3).forEach(System.out::println);
            直接阅读代码的字面意思即可完美展示无关逻辑方式的语义：生成流、过滤姓张、过滤长度为3、逐一打印
            Stream流把真正的函数式编程风格引入到Java中

 */

import java.util.ArrayList;

public class StreamDemo_01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        ArrayList<String> newList1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                newList1.add(s);
            }
        }

        ArrayList<String> newList2 = new ArrayList<>();
        for (String s : newList1) {
            if (s.length() == 3) {
                newList2.add(s);
            }
        }
//        System.out.println(newList2);
        System.out.println("-------------------------------------------");

        // Stream流改写
        list.stream().filter( s -> s.startsWith("张")).filter( s-> s.length() == 3).forEach(s -> System.out.println(s));
        list.stream().filter( s -> s.startsWith("张")).filter( s-> s.length() == 3).forEach(System.out::println);

    }
}
