package method_grammar;

/*
    方法参数传递（引用类型）
        对于引用类型的参数，形式参数的改变，影响实际参数的值
 */

public class MethodParamPassingTest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前：" + arr[1]);
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);
    }

    public static void change(int[] arr){
        arr[1] = 200;
    }
}
