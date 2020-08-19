package basic_grammar;

public class ForTest02 {
    public static void main(String[] args) {
        // 需求：求1-5之间的数据和，并把求和结果在控制台输出
        int result = 0;

        for (int i = 1; i <= 5; i++) {
            result += i;
        }

        System.out.println("1-5的累加和为：" + result);
    }
}
