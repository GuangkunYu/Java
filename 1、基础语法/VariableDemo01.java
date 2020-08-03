/*
变量：在程序运行过程中，其值可以发生改变的量。
	从本质上讲，变量是内存中一小块区域
变量定义格式：
	数据类型 变量名 =  变量值;
基本数据类型：
	byte, short, int, long, float, double, char, boolean
变量的使用：
	取值格式： 
		变量名
	修改值格式：
		变量名 = 变量值;
*/
public class VariableDemo01{
	public static void main(String[] args){
		// 定义变量
		int a = 10;
		
		// 输出变量
		System.out.println(a);
		
		// 修改变量
		a = 20;
		System.out.println(a);
		
	}
}