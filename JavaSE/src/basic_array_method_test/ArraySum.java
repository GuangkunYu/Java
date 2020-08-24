package basic_array_method_test;

/*
    需求：
        有这样一个数组，元素时{68,27,95,88,171,996,51,210}，求出该数组中满足要求的元素和。
        要求：求和的元素个位和十位都不能是7，并且只能是偶数
 */

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = 0;
        int evenSum = sum(arr, sum);
        System.out.println("符合要求的数据和：" + evenSum);
    }

    public static int sum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int shi = arr[i] / 10;
            int ge = arr[i] % 10;
            if ((shi != 7) && (ge != 7) && (arr[i] % 2 == 0)) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
