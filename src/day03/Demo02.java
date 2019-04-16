package day03;

public class Demo02 {
	public static void main(String args[]) {
		//如何找出最小数及中间数
		int a = 3 ;
		int b = 4 ;
		int c = 5 ;
		if(a<b&&a<c) {
			System.out.println("a是最小数");
		}
		else if(b<c) {
			System.out.println("b是最小数");
		}
		else {
			System.out.println("c是最小数");
		}
		if(a>b&&a<c||a<b&&a>c) {
			System.out.println("a是中间数");
		}
		else if(b>a&&b<c||b<a&&b>c) { //若上条代码不成立
			System.out.println("b是中间数");
		}
		else {
			System.out.println("c是中间数");
		}
	}
}
