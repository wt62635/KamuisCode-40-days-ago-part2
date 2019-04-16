package day02;

public class Demo03 {
	public static void main(String args[]) {
		//条件判断的演示
		//today超市促销，满50减12
		//设置一个消费金额，输出最终支付的金额
		int a = 59;
			if(a>=50) {
				a = a - 12;
			}
		System.out.println(a);
	}
}
