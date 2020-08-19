package basic_grammar;

/*
短路逻辑运算符：
	&&：
		短路与
	||：
		短路或
*/
public class OperatorDemo06 {
	public static void main(String[] args) {
//		定义变量
		int i = 10;
		int j = 20;
		int k = 30;
		
		// && 有false则false,短路效果
		System.out.println((i > j) && (i > k));	// false && false
		System.out.println((i < j) && (i > k));	// true && false
		System.out.println((i > j) && (i < k));	// false && true
		System.out.println((i < j) && (i < k));	// true && true
		System.out.println("--------------------");
		
		// || 有true则true
		System.out.println((i > j) || (i > k));	// false || false
		System.out.println((i < j) || (i > k));	// true || false
		System.out.println((i > j) || (i < k));	// false || true
		System.out.println((i < j) || (i < k));	// true || true
		System.out.println("--------------------");
		
		// &&和&，短路效果
		// System.out.println((i++ > 100) & (j++ > 100)); // false & false   11 21
		System.out.println((i++ > 100) && (j++ > 100)); // false && false	11 20
		System.out.println("i：" + i);
		System.out.println("j：" + j);
	}
}

/*
注意：
	逻辑与&，无论左边真假，右边都要执行
	短路与&&，如果左边为真，右边执行，如果左边为假，右边不执行

	逻辑或|，无论左边真假，右边都要执行。
	短路||，如果左边为假，右边执行；如果左边为真，右边不执行

*/