package method_reference.method_reference_01;

/*
    方法引用：
        :: 该符号为引用运算符，而它所在的表达式被称为方法引用

    需求：
        1.定义一个接口Printable, 里面定义一个抽象方法：void printString(String s);
        2.定义一个测试类PrintableDemo, 在测试类中提供了两个方法
            一个方法是：usePrintable(Printable p)
            一个方法是主方法，在主方法中调用usePrintable方法
 */

public class PrintableDemo {
    public static void main(String[] args) {


//        Printable pt = new PrintableImpl();
//        usePrintable(pt);
        usePrintable(s -> System.out.println(s));

        // 方法引用符 ::
        usePrintable(System.out::println);
    }

    private static void usePrintable(Printable p){
        p.printString("爱生活爱Java");
    }
}
