package Interface.InterStatic_01;

public interface Inter {
    void show();

    default void method() {
        System.out.println("默认方法method");
    }

    static void test() {
        System.out.println("静态方法test");
    }
}
