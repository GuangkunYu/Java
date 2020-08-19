package basic_grammar;

/*
	字符的“+”操作：
		拿字符在计算机底层对应的数值来进行计算的
		A-Z是连续的
		a-z是连续的
		0-9是连续的
*/
public class OperatorDemo02{
	public static void main(String[] args){
//		定义两个变量
		int i = 10;
		char c = 'A';	// 'A'��ֵ��65
		c = 'a';	// 'a'��ֵ��97
		c = '0';	// '0'��ֵ��48
		System.out.println(i + c);
		
		/* 
			算术表达式中包含多个基本数据类型的值的时候，整个算术表达式的类型会自动进行提升
			提升规则：
				byte类型，short类型和char类型将被提升到int类型
				整个表达式的类型自动提升到表达式中最高等级操作数同样的类型
				等级顺序：byte,short,char -> int -> long -> float -> double
		*/
		int in = i + c;
		System.out.println(in);
		
		double d = 10 + 13.14;
	}
}