package day03;

public class Demo03 {
	public static void main(String args[]) {
		//����һ�ַ������м�����
		int a = 3 ;
		int b = 4 ;
		int c = 5 ;
		int min ;
		int max ;
		//���ҳ������������Ϊmax
		if(a>b&&a>c) {
			max = a ;
			System.out.println("a�������");
		}
		else if(b>c) {			
			max = b ;		
		 System.out.println("b�������");
		}
		else {
			max = c ;
		System.out.println("c�������");
		}
		//���ҳ���С��������Ϊmin
		if(a<=b&&a<=c) {
			min = a ;
			System.out.println("a�������");
		}
		else if(b<=c) {
			min = b ;
			System.out.println("b�������");
		}
		else {
			min = c ;
			System.out.println("c�������");
		}
		int mid = a + b + c - max - min ;
		System.out.println(mid + "���м���");
	}
}
