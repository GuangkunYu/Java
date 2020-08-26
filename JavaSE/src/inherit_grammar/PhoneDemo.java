package inherit_grammar;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("张三");

        NewPhone np = new NewPhone();
        np.call("李四");
    }
}
