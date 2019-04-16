package javaday02;

public class RefDemo02 {
	public static void main(String[] args) {
		String str1 = "hello" ;
		System.out.println("fun()方法调用前值是：" + str1);
		fun(str1);
		System.out.println();
	}
	public static void fun(String str2) {
		str2 = "HELLO" ;
	}
}
