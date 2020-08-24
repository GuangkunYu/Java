package method_grammar;

/*
    方法参数传递（基本类型）
        对于基本类型的参数，形式参数的改变，不影响实际参数的值
 */
public class MethodParamPassingDemo {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("调用change方法前：" + num);
        change(num);
        System.out.println("调用change方法后：" + num);
    }

    public static void change(int num){
        num = 200;
    }
}
