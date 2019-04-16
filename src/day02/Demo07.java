package day02;

public class Demo07 {
	public static void main(String args[]) {
		//判断三条边能否组成三角形
		//判断三条边能否组成等边三角形
		//判断三条边能否组成等腰三角形
		//判断三条边能否组成直角三角形
		int a = 3 ;
		int b = 4 ;
		int c = 5 ;
		if(a+b>c&&b+c>a&&a+c>b) {
			System.out.println("是三角形");
		}
		else{
			System.out.println("不是三角形");
		}
		if(a==b&&b==c) {
			System.out.println("是等边三角形");
		}
		else {
			System.out.println("不是等边三角形");
		}
		if((a+b>c&&b+c>a&&a+c>b)&&(a==c||a==b||c==b)) {
			System.out.println("是等腰三角形");
		}
		else {
			System.out.println("不是等腰三角形");
		}
	}
}
