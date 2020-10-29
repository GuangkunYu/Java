package method_reference.class_method_01;

/*
    引用类方法：
        其实就是引用类的静态方法
        格式：
            类名::静态方法
        范例：
            Integer::parseInt
            Integer类的方法：public static int parseInt(String s) 将此String转换成int类型数据

    练习：
        1.定义一个接口Converter，里面定义一个抽象方法
            int convert(String s);
        2.定义一个测试类ConverterDemo，在测试类中提供两个方法
            一个方法是：useConverter(Converter c)
            一个方法是主方法，在主方法中调用useConverter方法
 */

public class Demo {
    public static void main(String[] args) {
        useConverter(Integer::parseInt);
    }

    private static void useConverter(Converter c){
        int number = c.convert("1234");
        System.out.println(number);
    }

}
