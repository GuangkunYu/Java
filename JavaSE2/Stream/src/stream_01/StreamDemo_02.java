package stream_01;

/*
    Stream流的生成方式：
        使用：
            生成流：
                通过数据源（集合、数组等）生成流
                list.stream()
            中间操作：
                一个流后面可以跟随零个或多个中间操作，其目的主要是打开流，做出某种程度的数据过滤/映射，然后返回一个新的流，交给下一
                个操作使用
                filter()
            终结操作：
                一个流只能有一个终结操作，当这个操作执行后，流就被用“光”了，无法再被操作。所以这必定是流的最后一个操作
                forEach()

        常见生成方式：
            Collection体系的集合可以使用默认方法stream()生成流
                default Stream<E> stream()
            Map体系的集合间接生成流
            数组可以通过Stream接口的静态方法of(T...values)生成流
 */

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo_02 {
    public static void main(String[] args) {
        // Collection体系的集合可以使用默认方法stream()生成流
        List<String > list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        // Map体系的集合间接生成流
        Map<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valuesStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        // 数组可以通过Stream接口的静态方法of(T...values)生成流
        String[] strAarray = {"HELLO", "WORLD", "JAVA"};
        Stream<String> stringStream = Stream.of(strAarray);
        Stream<String> stringStream1 = Stream.of("HELLO", "WORLD", "JAVA");
        Stream<Integer> integerStream = Stream.of(10, 20, 30);
    }
}
