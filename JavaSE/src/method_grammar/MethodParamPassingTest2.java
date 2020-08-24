package method_grammar;

/*
    需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]
 */

public class MethodParamPassingTest2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        traverse(arr);
    }

    public static void traverse(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++ ){
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
