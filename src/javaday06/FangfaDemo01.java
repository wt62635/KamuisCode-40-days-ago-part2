package javaday06;
//方法调用的复习
//public static 返回值类型 方法名称 （类型 参数1.类型 参数2，……）
public class FangfaDemo01 {
	public static void main(String[] args) {
		printInfo();
		System.out.println("Hello");
	}
	public static void printInfo() {
		char c[] = {'H','E','L','L','O'};
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println("");
	}
}
