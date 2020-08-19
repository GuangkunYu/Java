package basic_grammar;

/*
	赋值运算符：
		=	赋值	a=10, 将10赋值给变量a
*/
public class OperatorDemo {
	public static void main(String[] args) {
		// 把10赋值给int类型的变量i
		int i = 10;
		System.out.println("i：" + i);

		// += 把左边和右边的数据做加法操作，结果赋值给左边
		i += 20;	
		// i = i + 20;
		System.out.println("i：" + i);

		// 注意：扩展的赋值运算符底层隐含了强制类型转换
		short s = 10;
		s += 20;
		// s = (short)(s + 20);
		System.out.println("s：" + s);
		/*
			赋值运算符：
				=	赋值		a=10,将10赋值给变量a
				+=	加后赋值	a+=b,将a+b的值给a
				-=	减后赋值	a-=b,将a-b的值给a
				*=	乘后赋值	a*=b,将a*b的值给a
				/=	除后赋值	a/=b,将a/b的商给a
				%=	取余后赋值	a%=b,将a/b的余数给a
			扩展的赋值运算符隐含了强制类型转换
		*/
	}
}