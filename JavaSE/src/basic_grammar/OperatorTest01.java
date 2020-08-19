package basic_grammar;

/*
    需求：
        动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，用程序实现判断两只老虎的体重是否相同
*/
public class OperatorTest01 {
    public static void main(String[] args) {
        // 定义两个变量保存老虎的体重
        int weight1 = 180;
        int weight2 = 200;
        // 用三元运算符实现老虎体重的判断，相同返回true，否则返回false
        boolean result = (weight1 == weight2) ? true: false;
        // 输出结果
        System.out.println(result);
    }
}
