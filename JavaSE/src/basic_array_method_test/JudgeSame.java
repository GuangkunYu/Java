package basic_array_method_test;

/*
    需求：
        设计一个方法，用于比较两个数组的内容是否相同
 */

public class JudgeSame {
    public static void main(String[] args) {
        int[] arr1 = {68, 27, 95, 88, 171, 996, 51, 210};
        int[] arr2 = {68, 27, 95, 88, 171, 996, 51, 21};
        boolean b = judgeSame(arr1, arr2);
        System.out.println("两个数组内容是否相同：" + b);
    }

    public static boolean judgeSame(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
