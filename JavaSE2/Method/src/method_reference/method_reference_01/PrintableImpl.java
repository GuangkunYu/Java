package method_reference.method_reference_01;

public class PrintableImpl implements Printable {
    @Override
    public void printString(String s) {
        System.out.println(s + "什么玩意");
    }
}
