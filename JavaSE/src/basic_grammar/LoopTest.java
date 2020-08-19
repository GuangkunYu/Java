package basic_grammar;

/*
    三种循环的区别：
        for循环和while循环先判断条件是否成立，然后决定是否执行循环体（先判断后执行）
        do...while循环先执行一次循环体，然后判断条件是否成立，是否继续执行循环体（先执行后判断）

    for和while的区别：
        条件控制语句所控制的自增变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
        条件控制语句所控制的自增变量，对于while循环来说不归属其语法结构，在while循环结束后，该变量还可以继续使用

    死循环：
        for(;;){}
        while(true){}
        do{}while(true);
        while的死循环格式是最常用的
        Ctrl+C可以结束死循环
 */
public class LoopTest {
    public static void main(String[] args) {
        // for 循环
        for (int i = 1; i < 3; i++){
            System.out.println("for循环");
        }
        System.out.println("---------");

        // while 循环
        int j = 1;
        while (j < 3){
            System.out.println("while循环");
            j++;
        }
        System.out.println("----------");

        // do...while循环
        int k = 1;
        do {
            System.out.println("do...while循环");
            k++;
        }while (k < 3);
    }
}
