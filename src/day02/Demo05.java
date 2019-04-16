package day02;

public class Demo05 {
	public static void main(String args[]) {
		//滴滴打车计价程序
		//规则：起步价10元（3公里）,超过3公里的部分
		//每公里加收2元
		//根据乘坐的公里数，输出实际需要支付金额y
		int x = 8 ;
		int y  ;
		if(x > 3) {
			y = 10 + (x - 3) * 2 ;
			}
		else {
			y = 10 ;
		}
		System.out.println(y);
	}
}