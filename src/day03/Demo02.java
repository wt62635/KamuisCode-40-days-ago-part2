package day03;

public class Demo02 {
	public static void main(String args[]) {
		//����ҳ���С�����м���
		int a = 3 ;
		int b = 4 ;
		int c = 5 ;
		if(a<b&&a<c) {
			System.out.println("a����С��");
		}
		else if(b<c) {
			System.out.println("b����С��");
		}
		else {
			System.out.println("c����С��");
		}
		if(a>b&&a<c||a<b&&a>c) {
			System.out.println("a���м���");
		}
		else if(b>a&&b<c||b<a&&b>c) { //���������벻����
			System.out.println("b���м���");
		}
		else {
			System.out.println("c���м���");
		}
	}
}
