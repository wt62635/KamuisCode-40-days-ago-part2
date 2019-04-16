package day02;

public class Demo04 {
	public static void main(String args[]) {
		//滴滴打车计价程序
		//规则：起步价10元（3公里）,超过3公里的部分
		//每公里加收2元
		//根据乘坐的公里数，输出实际需要支付金额y
		int start = 10 ;	 //定义起步价
		int rmb = 0;		//定义最终价
		int km = 28 ;	 	//定义公里数
		int plus = 2 ;		//定义加收价
		if(km>=3) {
			rmb = start + (km*plus) ;
		System.out.println("最终价为" + rmb + "元");
		}
		else {
			rmb = start ;
		System.out.println("最终价为" + rmb + "元");	
		}
	}

}
