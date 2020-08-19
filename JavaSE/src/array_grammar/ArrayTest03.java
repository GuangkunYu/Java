package array_grammar;

/*
    获取数组最值：

 */

public class ArrayTest03 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {12, 45, 98, 73, 64};

        // 取数组中第一个元素为最大值的默认值
        int max = arr[0];

        // 遍历数组元素，进行判断，得到最大值
        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        // 输出最大值
        System.out.println("最大值：" + max);
    }
}
