/*
	自增自减运算符：
		++	自增	变量的值加1
		--	自减	变量的值减1
*/
public class OperatorDemo03 {
	public static void main(String[] args) {
		// 定义变量
		int i = 10;
		System.out.println("i：" + i);
		
		// 单独使用
		// i++;
		// ++i;
		// System.out.println("i：" + i);
		
		// 参与操作使用
		// int j = i++;
		int j = ++i;
		System.out.println("i：" + i);
		System.out.println("j：" + j);
		
		/*
			注意事项：
				++ 和 -- 既可以放在变量的后边，也可以放在变量的前边
				单独使用的时候，++ 和 -- 无论是放在变量的前边还是后边，结果是一样的
				参与操作的时候，如果放在变量的后边，先拿变量参与操作，后拿变量做++或--
				参与操作的时候，如果放在变量的前边，先拿变量做++或--，后拿变量参与操作
		*/
	}
}