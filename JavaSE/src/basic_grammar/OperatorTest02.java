package basic_grammar;

/*
    需求：
        一座寺庙里住着3个和尚，已知身高分别为150cm、210cm、165cm，请用程序实现获取这三个和尚的最高身高
 */

public class OperatorTest02 {
    public static void main(String[] args) {
        // 定义三个变量保存身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        // 用三元运算符先获取前两个和尚的较高值，然后在比较较高的和剩余的一个
        int temp = (height1 > height2) ? height1: height2;
        int maxHeight = (temp > height3) ? temp: height3;

        // 输出最高的身高
        System.out.println("最高身高：" + maxHeight);
    }
}
