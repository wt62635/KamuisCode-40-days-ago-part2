package day02;

public class ForDemo01 {
	public static void main(String args[]) {
		int sum = 0 ;
		for(int a = 1 ; a <= 100 ; a++) {
			sum += a ;						//sum保存累加值
		}
		System.out.println("输出从1累加至100的结果为：" + sum);
	}

}
