package stream_01;

/*
    Stream流的常见中间操作方法：
        Stream<T> filter(Predicate predicate)：用于对流中的数据进行过滤
            Predicate接口中的方法     boolean test(T t)：对给定的参数进行判断，返回一个布尔值
        Stream<T> limit(long maxSize)：
            返回此流中的元素组成的流，截取前指定参数个数的数据
        Stream<T> skip(long n)：
            跳过指定参数个数的数据，返回由该流的剩余元素组成的流
        static <T> Stream<T> concat(Stream a, Stream b)：
            合并a和b两个流为一个流
        Stream<T> distinct():
            返回由该流的不同元素(根据Object.equals(Object))组成的流
        Stream<T> sorted()：
            返回由此流的元素组成的流，根据自然顺序排序
        Stream<T> sorted(Comparator comparator):
            返回由该流的元素组成的流，根据提供的Comparator进行排序
 */

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo_06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");

        // 需求1：按照字母顺序把数据在控制台输出
//        list.stream().sorted().forEach(System.out::println);

        // 需求2：按照字符串长度把数据在控制台输出
//        list.stream().sorted((s1, s2) -> s1.length() -s2.length()).forEach(System.out::println);
        list.stream().sorted( (s1, s2) -> {
            int num = s1.length() - s2.length();
            int num2 = num == 0 ? s1.compareTo(s2):num;
            return num2;
        }).forEach(System.out::println);

    }
}
