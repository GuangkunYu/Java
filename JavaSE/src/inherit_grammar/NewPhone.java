package inherit_grammar;

/*
    @Override：
        是一个注解（注解后面会学习到）
        可以帮助我们检查重写方法的方法声明的正确性
 */
public class NewPhone extends Phone {
    @Override
    public void call(String name){
        System.out.println("开启视频功能");
        super.call(name);
    }
}
