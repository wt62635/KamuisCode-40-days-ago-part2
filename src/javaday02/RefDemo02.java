package javaday02;

public class RefDemo02 {
	public static void main(String[] args) {
		String str1 = "hello" ;
		System.out.println("fun()��������ǰֵ�ǣ�" + str1);
		fun(str1);
		System.out.println();
	}
	public static void fun(String str2) {
		str2 = "HELLO" ;
	}
}
