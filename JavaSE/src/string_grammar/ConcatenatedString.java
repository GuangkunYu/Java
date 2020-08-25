package string_grammar;

/*
    需求:
        定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
        并在控制台输出结果，例如，数组为int[] arr={1,2,3};执行方法后的输出结果为：
        [1, 2, 3]
 */

public class ConcatenatedString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = concatenated(arr);
        System.out.println("拼接后的结果：" + s);
    }

    private static String concatenated(int[] arr) {
        String line = "[";
        for (int i=0; i<arr.length; i++){
            if (i == arr.length-1){
                line = line + arr[i] + "]";
            }else {
                line = line + arr[i] + ", ";
            }
        }
        return line;
    }
}
