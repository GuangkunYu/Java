package basic_array_method_test;

/*
    需求：
        已知一个数组arr={19,28,37,46,50};用程序实现把数组中的元素值交换，
        交换后的数组arr={50,46,37,28,19};并在控制台输出交换后的数组元素
 */

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        reverse1(arr);
        reverse2(arr);
    }

    /*
        这个方法是创建一个新的数组来保存反转后的数组
    */
    public static void reverse1(int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            arr2[i] = arr[arr.length-i-1];
        }
        System.out.print("[");
        for (int j=0; j<arr2.length; j++){
            if (j == arr2.length-1){
                System.out.print(arr2[j]);
            }else {
                System.out.print(arr2[j] + ",");
            }
        }
        System.out.println("]");
    }

    /*
        这个方法是用临时变量保存数组元素进行交换
    */
    public static void reverse2(int[] arr){
        for (int m = 0; m < arr.length/2; m++){
            int temp = arr[m];
            arr[m] = arr[arr.length-m-1];
            arr[arr.length-m-1] = temp;
        }
        System.out.print("[");
        for (int j=0; j<arr.length; j++){
            if (j == arr.length-1){
                System.out.print(arr[j]);
            }else {
                System.out.print(arr[j] + ",");
            }
        }
        System.out.print("]");

    }
}
