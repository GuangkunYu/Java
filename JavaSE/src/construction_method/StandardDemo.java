package construction_method;

public class StandardDemo {
    public static void main(String[] args) {
        // 无参构造方法创建对象后赋值
        Standard st = new Standard();
        st.setName("张三");
        st.setAge(30);
        st.show();

        // 使用带参数构造方法直接创建带属性值的对象
        Standard sta = new Standard("李四", 38);
        sta.show();
    }
}
