package array_grammar;

/*
    遍历数组：
        获取数组元素的数量：
            数组名.length
            arr.length
        遍历通用格式：
            int[] arr = {....};
            for(int i=0; x<arr.length; x++){
                arr[x];
            }
 */

public class ArrayTest02 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {11, 22, 33, 44, 55};

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
