package day05;
//方法的声明与调用--静态方法调用练习
public class MethodDemo02 {
	public static void main(String args[]) {
		System.out.print("a+b=");
		sum();		
	}
	public static void sum() {
		int a = 0 ;
		int b = 20 ;
		int sum = a + b ;
		System.out.println(sum);
	
	}
}