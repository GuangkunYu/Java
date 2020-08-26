package inherit_grammar;

public class StuTeaDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.teach();
        t.setName("张三");
        System.out.println(t.getName());

        Student s = new Student();
        s.study();
    }
}
