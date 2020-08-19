package basic_grammar;

public class ForTest04 {
    public static void main(String[] args) {
        /*
            需求：在控制台输出所有的水仙花数
            水仙花数是一个三位数
            水仙花数的个位、十位、百位的数字立方和等于原数
        */
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            int sum = (ge * ge * ge) + (bai * bai * bai) + (shi * shi * shi);
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
/*
    任意数字的指定位上的数值如何求：
        先使用整除操作将要求的数移动到个位上，再使用取余操作取出最后一位上的值
*/