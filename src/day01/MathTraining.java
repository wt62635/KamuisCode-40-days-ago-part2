package day01;

public class MathTraining {
	public static void main(String args[]) {
		int n = 65481 ;
		int x = n / 10000 ;			//�ó���λ
		int a = (n / 1000) % 10 ;	//�ó�ǧλ
		int b = (n / 100) % 10 ;	//�ó���λ
		int c = (n / 10 ) % 10 ; 	//�ó�ʮλ
		int d = n %10 ;				//�ó���λ
		System.out.println("������λΪ"+ x 
							+ "������ǧλΪ"+ a 
							+ "�����İ�λΪ" + b 
							+ "������ʮλΪ" + c 
							+ "�����ĸ�λΪ" + d);
	}
}
