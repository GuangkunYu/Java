package basic_array_method_test;

/*
    需求：
        有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后，每个月又
        生一对兔子，加入兔子都不死，问第二十个月的兔子对数是多少？
 */

public class UndeadRabbit {
    public static void main(String[] args) {
        int month = 20;
        rawRabbit(month);
    }

    public static void rawRabbit(int mon) {
        int[] arr = new int[mon];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("第" + mon + "个月的兔子对数是：" + arr[mon - 1]);
    }
}
