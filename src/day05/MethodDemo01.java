package day05;
//方法的声明与调用
public class MethodDemo01 {
	public static void main(String args[]) {
		printInfo();			//调用printInfo方法
		printInfo();			//调用printInfo方法
		printInfo();			//调用printInfo方法
		System.out.println("HelloWorld!!");
	}
	public static void printInfo() {	//声明printInfo方法
		char c[] = {'H','e','l','l','o',',','H','J','B'};
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println("");
	}
}
