/*
	��ϵ�������
		==		a==b,�ж�a��b��ֵ�Ƿ���ȣ�����Ϊtrue��������Ϊfalse
		!=		a!=b,�ж�a��b��ֵ�Ƿ���ȣ�����Ϊtrue��������Ϊfalse
		>		a>b,�ж�a�Ƿ����b������Ϊtrue��������Ϊfalse
		>=		a>=b,�ж�a�Ƿ���ڵ���b������Ϊtrue��������Ϊfalse
		<		a<b,�ж�a�Ƿ�С��b������Ϊtrue��������Ϊfalse
		<=		a<=b,�ж�a�Ƿ�С�ڵ���b������Ϊtrue��������Ϊfalse
*/
public class OperatorDemo04 {
	public static void main(String[] args) {
		// �������
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
		
		// ע�⣺
		// ��С�İ�==д����=
		// ��j��ֵ������i��Ȼ�����i��ֵ
		System.out.println(i = j);
		System.out.println("------------");
	}
}