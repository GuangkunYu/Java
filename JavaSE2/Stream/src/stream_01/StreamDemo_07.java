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
        <R> Stream<R> map(Function mapper)：
            返回由给定函数应用于此流的元素的结果组成的流
            Function接口中的方法  R apply(T t)
        IntStream map ToInt(ToIntFunction mapper):
            返回一个IntStream其中包含将给定函数应用于此流的元素的结果
            IntStream：表示原始int流
            ToIntFunction接口中的方法     int applyAsInt(T value)
 */

import java.util.ArrayList;

public class StreamDemo_07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        // 需求1：将集合中的字符串数据转换为整数之后在控制台输出
//        list.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
//        list.stream().map(Integer::parseInt).forEach(System.out::println);

        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        // int sum() 返回此流中元素的总和
        int res = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(res);
    }
}
