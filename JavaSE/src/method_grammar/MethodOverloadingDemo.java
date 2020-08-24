package method_grammar;

/*
    方法重载：
        指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载
        - 多个方法在同一个类中
        - 多个方法具有相同的方法名
        - 多个方法的参数不相同，类型不同或者数量不同

    方法重载的特点：
        - 重载仅对应方法的定义，与方法的调用无关，调用方式参照标准格式
        - 重载仅针对同一个类中方法的名称与参数进行识别，与返回值无关，换句话说不能通过返回值来判定
          两个方法是否相互构成重载
 */

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int e = 30;
        double c = 40.0;
        double d = 50.1;

        int res1 = sum(a, b);
        System.out.println(res1);

        double res2 = sum(c, d);
        System.out.println(res2);

        int res3 = sum(a, b, e);
        System.out.println(res3);
    }

    // 需求1：求两个int类型数据和的方法
    public static int sum(int a, int b){
        return a + b;
    }

    // 需求2：求两个double类型数据和的方法
    public static double sum(double a, double b){
        return a + b;
    }

    // 需求3：求三个int类型数据和的方法
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}

/*
    方法重载：
        与返回值无关
        在调用的时候，java虚拟机会通过参数的不同来区分同名的方法
 */
