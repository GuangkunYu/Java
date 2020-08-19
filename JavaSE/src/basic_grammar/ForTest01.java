package basic_grammar;

/*
    需求：在控制台输出1-5和5-1的数据
*/
public class ForTest01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }
    }
}
