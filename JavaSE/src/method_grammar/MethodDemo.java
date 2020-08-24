package method_grammar;

/*
    方法：
        是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集
        注意：
            方法必须先创建才可以使用，该过程称为方法定义
            方法创建后并不是直接运行的，需要手动使用后才执行，该过程称为方法调用
    方法定义：
        格式：
            public static void 方法名(){
                方法体；
            }
    方法调用：
        格式：
            方法名();
 */
public class MethodDemo {
    public static void main(String[] args) {
        // 调用方法
        isEven();
    }

    // 需求：定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
    public static void isEven(){
        int a = 9;
        if (a % 2 == 0){
            System.out.println(a + "是偶数");
        }else{
            System.out.println(a + "不是偶数");
        }
    }
}
