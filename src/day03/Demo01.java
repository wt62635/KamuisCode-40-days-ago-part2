package day03;

public class Demo01 {
	public static void main(String args[]) {
		int a = 7 ;
		int b = 6 ;
		int c = 7 ;
		//����ҳ������
		if(a>b&&a>c) {
				System.out.println("a�������");
			}
		else if(b>c) {	//��������������������֤�����������������������
			 System.out.println("b�������");
		}
		else {
			System.out.println("c�������");
		}
		if(a==b){
			System.out.println("ab���");
		}
		//�ж�һ��������������������0		
		if(a > 0) {
			System.out.println("����");
		}
		else if(a < 0) {
			System.out.println("����");
		}
		else {
			System.out.println("��0");
		}
	}
}
