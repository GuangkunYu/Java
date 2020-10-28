package Interface.InterDefault_01;

public interface MyInterface {
    void show1();

    void show2();

    default void show3() {
        System.out.println("show3");
    }
}
