package day03;

public class Demo03 {
	public static void main(String args[]) {
		//用另一种方法找中间数。
		int a = 3 ;
		int b = 4 ;
		int c = 5 ;
		int min ;
		int max ;
		//先找出最大数，定义为max
		if(a>b&&a>c) {
			max = a ;
			System.out.println("a是最大数");
		}
		else if(b>c) {			
			max = b ;		
		 System.out.println("b是最大数");
		}
		else {
			max = c ;
		System.out.println("c是最大数");
		}
		//在找出最小数，定义为min
		if(a<=b&&a<=c) {
			min = a ;
			System.out.println("a是最大数");
		}
		else if(b<=c) {
			min = b ;
			System.out.println("b是最大数");
		}
		else {
			min = c ;
			System.out.println("c是最大数");
		}
		int mid = a + b + c - max - min ;
		System.out.println(mid + "是中间数");
	}
}
