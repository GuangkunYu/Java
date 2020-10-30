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
 */

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo_05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");


        // 需求1：取前4个数据组成一个流
        Stream<String> s1 = list.stream().limit(4);

        // 需求2：跳过2个数据组成一个流
        Stream<String> s2 = list.stream().skip(2);

        // 需求3：合并需求1和需求2得到的流，并把结果在控制台输出
//        Stream.concat(s1, s2).forEach(System.out::println);
        System.out.println("----------------------------");

        // 需求4：合并需求1和需求2得到的流，并把结果在控制台输出，要求字符串元素不能重复
        Stream.concat(s1, s2).distinct().forEach(System.out::println);
    }
}
