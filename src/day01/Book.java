package day01;

public class Book {
	public static void main(String args[]) {
		int a = 50;
		int b = 10;
		Book book = new Book();
		System.out.println("a��+b��ĺ�Ϊ��" + book.add(a, b) + 
							"��������������£�a"+ a + "���飬b��"
							+ b + "����");

	}

	private int add(int a, int b) {
		b = b + a;
		return b;
	}
}
	