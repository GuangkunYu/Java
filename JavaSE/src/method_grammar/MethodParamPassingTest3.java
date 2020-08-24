package method_grammar;

/*
    需求：
        设计一个方法用于获取数组中元素的最大值，调用方法并输出结果
 */

public class MethodParamPassingTest3 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 66, 33, 44, 77, 55};
        int max = getMaxArr(arr);
        System.out.println("最大值为：" + max);
    }

    public static int getMaxArr(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
