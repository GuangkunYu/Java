package basic_grammar;

/*
	类型转换：
		自动类型转换：
			把一个表示数据范围小的数值或者变量赋值给另一个表示数据范围大的变量
			范例：double d = 10;
			byte -> short -> int -> long -> float -> double
					char  ->
		强制类型转换：
			把一个表示数据范围大的数值或者变量赋值给另一个表示数据范围小的变量
			格式：
				目标数据类型 变量名 = (目标数据类型)值或者变量;
			范例：
				int k = (int)88.88;
*/
public class ConversionDemo{
	public static void main(String[] args){
		// 自动类型转换
		double d = 10;
		System.out.println(d);
		
		// 定义byte类型的变量
		byte b = 10;
		short s = b;
		int i = b;

		// 这是不兼容的
		// char c = b;

		// 强制类型转换：不建议，有数据的丢失
		int k = (int)88.88;
		System.out.println(k);
	}
}