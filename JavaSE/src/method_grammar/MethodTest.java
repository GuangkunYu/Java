package method_grammar;

/*
    需求：
        设计一个方法用于打印两个数中的较大数
 */
public class MethodTest {
    public static void main(String[] args) {
        getMax();
    }

    // 定义一个方法
    public static void getMax(){
        int a = 10;
        int b = 20;

        int max = a > b ? a : b;

        System.out.println("最大数是：" + max);
    }
}
