package day02;

public class Demo06 {
	public static void main(String args[]) {
		//找零程序
		//设置消费金额m1，支付金额m2
		//分情况讨论，m1>m2，输出支付金额不足，还欠.....
		//若m1<=m2输出找零
		int m1 = 80 ;
		int m2 = 100 ;
		if(m1>m2) {
			m1 = m2 - m1 ;
			System.out.println("支付金额不足，还欠" + m1 +"元");
		}
		if(m1<=m2) {
			
		}
	}

}
