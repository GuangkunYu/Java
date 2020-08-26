package inherit_grammar;

public class Cat extends Animals{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catMouse(){
        System.out.println("抓老鼠");
    }
}
