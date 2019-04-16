package day01;

public class ThreeIntChange {
	public static void main(String args[]) {
		int a = 3 ;
		int b = 4 ;
		int c = 5 ;
		//交换a b c值，结果为 a5 b3 c4 , 不使用第四变量
		a = a + c + b ;			//12 = 3 + 5 + 4						
		b = a - b - c ;			//3 = 12 - 4 - 5
		c = a - b - c ;			//5 = 12 - 3 - 5
		a = a - b - c ;			//5 = 12 - 3 - 4
		System.out.println("a = " + a + "，b = " + b + "，c = " + c );
	}
}
