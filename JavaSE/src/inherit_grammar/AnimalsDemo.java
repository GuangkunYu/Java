package inherit_grammar;

public class AnimalsDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("多来Am鞥");
        c.setAge(4);
        System.out.println(c.getName()+", "+c.getAge()+"岁");
        c.catMouse();

        Cat c2 = new Cat("冷冻机房", 9);
        System.out.println(c2.getName()+", "+c2.getAge()+"岁");
        c.catMouse();

    }
}
