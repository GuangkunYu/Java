/*
	����ת����
		�Զ�����ת����
			��һ����ʾ���ݷ�ΧС����ֵ���߱�����ֵ����һ����ʾ���ݷ�Χ��ı���
			������double d = 10;
			byte -> short -> int -> long -> float -> double
					char  ->
		ǿ������ת����
			��һ����ʾ���ݷ�Χ�����ֵ���߱�����ֵ����һ����ʾ���ݷ�ΧС�ı���
			��ʽ��
				Ŀ���������� ������ = (Ŀ����������)ֵ���߱���;
			������
				int k = (int)88.88;
*/
public class ConversionDemo{
	public static void main(String[] args){
		// �Զ�����ת��
		double d = 10;
		System.out.println(d);
		
		// ����byte���͵ı���
		byte b = 10;
		short s = b;
		int i = b;
		
		// ���ǲ����ݵ�
		// char c = b;
		
		// ǿ������ת���������飬�����ݵĶ�ʧ
		int k = (int)88.88;
		System.out.println(k);
	}
}