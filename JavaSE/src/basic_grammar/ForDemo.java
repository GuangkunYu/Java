package basic_grammar;

/*
    for循环语句：
        格式：
            for (初始化语句；条件判断语句；条件控制语句){
                循环体语句；
            }
        执行流程：
            1、执行初始化语句
            2、执行条件判断语句，看起结果是true还是false
                如果是false，循环结束
                如果是true，继续执行
            3、执行循环体语句
            4、执行条件控制语句
            5、回到2继续
 */
public class ForDemo {
    public static void main(String[] args) {
        // 需求：在控制台输出5次“HelloWorld”
        for (int i = 1; i <= 5; i++){
            System.out.println(i + "HelloWorld");
        }
    }
}
