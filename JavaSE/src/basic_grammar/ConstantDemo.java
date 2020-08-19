package basic_grammar;

/*
1.关键字：
	就是被Java语言赋予了特定含义的单词

	特点：
		关键字的字母全部小写
		常用的代码编辑器，针对关键字有特殊的颜色标记，非常直观

2.常量：
	在程序运行过程中，其值不可以发生改变的量

	分类：
	字符串常量		用双引号括起来的内容	"HelloWorld"
	整数常量		不带小数的数字			668
	小数常量		带小数的数字			13.14
	字符常量		用单引号括起来的内容	'A','0','我'
	布尔常量		布尔值，表示真假		只有两个值：true,false
	空常量			一个特殊的值，空值		值是：null
*/
public class ConstantDemo {
	public static void main(String[] args) {
		// 字符串常量
		System.out.println("HelloWorld");
		System.out.println("-----------");
		
		// 整数常量
		System.out.println(666);
		System.out.println("-----------");
		
		// 小数常量
		System.out.println(13.14);
		System.out.println("-----------");
		
		// 字符常量
		System.out.println('A');
		System.out.println("-----------");
		
		// 布尔常量
		System.out.println(true);
		System.out.println("-----------");
		
		// 空常量 : 不能直接输出
		// System.out.println(null);
		System.out.println("-----------");
	}
}