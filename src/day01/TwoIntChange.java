package day01;

public class TwoIntChange {
	public static void main(String args[]) {
		int a = 5 ;
		int b = 10 ;
		a = a + b ;		//a = 5 +10
		b = a - b ;		//b = 15 - 10
		a = a - b ;		//a = 15 - 5
		System.out.println("a = " + a + ",b = " + b);
	}
}
