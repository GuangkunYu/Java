package basic_grammar;

/*
	关系运算符：
		==		a==b,判断a和b的值是否相等，成立为true，不成立为false
		!=		a!=b,判断a和b的值是否不相等，成立为true，不成立为false
		>		a>b,判断a是否大于b，成立为true，不成立为false
		>=		a>=b,判断a是否大于等于b，成立为true，不成立为false
		<		a<b,判断a是否小于b，成立为true，不成立为false
		<=		a<=b,判断a是否小于等于b，成立为true，不成立为false
*/
public class OperatorDemo04 {
	public static void main(String[] args) {
//		定义变量
		int i = 10;
		int j = 20;
		int k = 10;
		
		// ==
		System.out.println(i == j);
		System.out.println(i == k);
		System.out.println("------------");
		
		// !=
		System.out.println(i != j);
		System.out.println(i != k);
		System.out.println("------------");
		
		// >
		System.out.println(i > j);
		System.out.println(i > k);
		System.out.println("------------");
		
		// >=
		System.out.println(i >= j);
		System.out.println(i >= k);
		System.out.println("------------");
		
		// <
		System.out.println(i < j);
		System.out.println(i < k);
		System.out.println("------------");
		
		// <=
		System.out.println(i <= j);
		System.out.println(i <= k);
		System.out.println("------------");

		// 注意：
		// 不小心把==写成了=
		// 把j的值赋给了i，然后输出i的值
		System.out.println(i = j);
		System.out.println("------------");
	}
}