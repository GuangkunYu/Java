/*
	�ַ��ġ�+��������
		���ַ��ڼ�����ײ��Ӧ����ֵ�����м����
		A-Z��������
		a-z��������
		0-9��������
*/
public class OperatorDemo02{
	public static void main(String[] args){
		// ������������
		int i = 10;
		char c = 'A';	// 'A'��ֵ��65
		c = 'a';	// 'a'��ֵ��97
		c = '0';	// '0'��ֵ��48
		System.out.println(i + c);
		
		/* 
			�������ʽ�а�����������������͵�ֵ��ʱ�������������ʽ�����ͻ��Զ���������
			��������
				byte���ͣ�short���ͺ�char���ͽ���������int����
				�������ʽ�������Զ����������ʽ����ߵȼ�������ͬ��������
				�ȼ�˳��byte,short,char -> int -> long -> float -> double
		*/
		int in = i + c;
		System.out.println(in);
		
		double d = 10 + 13.14;
	}
}