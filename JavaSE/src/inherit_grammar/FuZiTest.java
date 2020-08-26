package inherit_grammar;

public class FuZiTest {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.show();

        Zi z = new Zi();
        z.method();
        z.show();

        Zi zi = new Zi(20);
    }
}
