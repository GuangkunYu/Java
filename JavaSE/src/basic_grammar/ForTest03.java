package basic_grammar;

public class ForTest03 {
    public static void main(String[] args) {
        // 需求：求1-100之间的偶数和，并把求和结果在控制台输出
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("1-100之间的偶数和为：" + sum);
    }
}
