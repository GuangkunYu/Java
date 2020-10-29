package common_method_inter.Predicate;

/*
    练习：
        String[] strArray = {"林青霞,30","柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
        字符串数组中有多条信息，请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，并遍历ArrayList集合
        同时满足如下要求：名字长度大于2，年龄大于33
 */

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
        ArrayList<String> arr = myFilter(
                strArray,
                s -> s.split(",")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) > 33
        );
        for (String s: arr){
            System.out.println(s);
        }
    }

    private static ArrayList<String> myFilter(String[] str, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> array = new ArrayList<>();
        for (String s : str) {
            if (pre1.and(pre2).test(s)) {
                array.add(s);
            }
        }
        return array;
    }
}
