package day01;

public class MathTraining02 {
	public static void main(String args[]) {
		int n = 9527 ;
		int a = n / 1000 ;		//取得第一位数
		int b = n / 100 % 10 ;	//取得第二位数
		int c = n / 10 % 10 ;	//取得第三位数
		int d = n % 10 ;		//取得第四位数
		System.out.println("将" + n + "的位数反转后为" + d + c + b +a );
		//将数值按字符串输出
	}
}
