package basic_grammar;

public class ForTest05 {
    public static void main(String[] args) {
        // 需求：统计“水仙花”数一共有多少个，并在控制台输出个数
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            int sum = (ge * ge * ge) + (bai * bai * bai) + (shi * shi * shi);
            if (sum == i) {
                count++;
            }
        }
        System.out.println("水仙花数一共有：" + count + "个");
    }
}
