package method_grammar;

/*
    带返回值方法的定义：
        格式：
            public static 数据类型 方法名(参数){
                return 数据;
            }
        范例1：
            public static boolean isEvenNumber(int number){
                return true;
            }
        范例2：
            public static int getMax(int a, int b){
                return 100;
            }
        注意：
            方法定义时return后面的返回值与方法定义上的数据类型要匹配，否则程序报错

    带返回值方法的调用：
        格式：
            数据类型 变量名 = 方法名(参数);
        注意：
            方法的返回值通常会使用变量接收，否则该返回值将无意义
 */
public class MethodReturnDemo {
    public static void main(String[] args) {
        // 需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数，并返回真假值
        int a = 9;
        boolean res = isEven(a);
        System.out.println(a + "is even is：" + res);
    }

    public static boolean isEven(int a){
        if (a % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}

/*
    方法的注意事项：
        方法不能嵌套定义
        void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据
 */
