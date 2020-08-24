package method_grammar;

/*
    需求：使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte,short,int,long）
 */

public class MethodOverloadingTest {
    public static void main(String[] args) {
        boolean res = numSame(10, 20);
        System.out.println(res);
    }

    public static boolean numSame(byte a, byte b){
        if(a==b){
            return true;
        }else {
            return false;
        }
    }

    public static boolean numSame(short a, short b){
        if(a==b){
            return true;
        }else {
            return false;
        }
    }

    public static boolean numSame(int a, int b){
        if(a==b){
            return true;
        }else {
            return false;
        }
    }

    public static boolean numSame(long a, long b){
        if(a==b){
            return true;
        }else {
            return false;
        }
    }
}
