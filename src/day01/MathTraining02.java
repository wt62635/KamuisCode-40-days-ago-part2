package day01;

public class MathTraining02 {
	public static void main(String args[]) {
		int n = 9527 ;
		int a = n / 1000 ;		//ȡ�õ�һλ��
		int b = n / 100 % 10 ;	//ȡ�õڶ�λ��
		int c = n / 10 % 10 ;	//ȡ�õ���λ��
		int d = n % 10 ;		//ȡ�õ���λ��
		System.out.println("��" + n + "��λ����ת��Ϊ" + d + c + b +a );
		//����ֵ���ַ������
	}
}
