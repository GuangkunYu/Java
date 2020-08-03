/*
	算术运算符：
		运算符和表达式：
			运算符：对常量或者变量进行操作的符号
			表达式：用运算符把常量或者变量连接起来符合Java语法的式子就可以称为表达式
					不同运算符连接的表达式体现的是不同类型的表达式
			举例说明：
				int a = 10;
				int b = 20;
				int c = a + b;
				
				+：是运算符，并且是算术运算符
				a + b：是表达式，由于+是算术运算符，所以这个表达式叫算术表达式
		算术运算符：
			+	加
			-	减
			*	乘
			/	除
			%	取余
		
*/
public class OperatorDemo01{
	public static void main(String[] args){
		// 定义两个变量
		int a = 6;
		int b = 4;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		// 除法得到的是商，取余得到的是余数
		
		// 整数相除只能得到整数，要得到小数，必须有浮点数的参与
		System.out.println(6.0 / 4);
	}
}
