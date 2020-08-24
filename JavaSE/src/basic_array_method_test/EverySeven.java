package basic_array_method_test;

/*
    需求：
        朋友聚会的时候可能会玩一个游戏：逢七过。
        规则：
            从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说：过。
            为了帮助大家更好的玩这个游戏，这里我们直接在控制台打印出1-100之间满足
            逢七过规则的数据。这样大家将来在玩游戏的时候，就知道哪些数据要说：过。
 */

public class EverySeven {
    public static void main(String[] args) {
        rule();
    }

    public static void rule() {
        // 个位是7，十位是7,和7的倍数
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10== 7) {
                System.out.println(i);
            }
        }
    }
}
