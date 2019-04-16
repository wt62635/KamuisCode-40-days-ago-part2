package day03;

public class Demo01 {
	public static void main(String args[]) {
		int a = 7 ;
		int b = 6 ;
		int c = 7 ;
		//如何找出最大数
		if(a>b&&a>c) {
				System.out.println("a是最大数");
			}
		else if(b>c) {	//若代码运行至此条，则证明上条代码的条件不成立。
			 System.out.println("b是最大数");
		}
		else {
			System.out.println("c是最大数");
		}
		if(a==b){
			System.out.println("ab相等");
		}
		//判断一个整数是正数负数还是0		
		if(a > 0) {
			System.out.println("正数");
		}
		else if(a < 0) {
			System.out.println("正数");
		}
		else {
			System.out.println("是0");
		}
	}
}
