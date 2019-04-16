package day03;

import java.util.Random;

public class Demo05 {
	public static void main(String args[]) {
		//练习题：模拟支付宝随机立减
		Random r = new Random();
		int  a = 1;					//假设支付金额为1
		/*要求：
		定义int a 为消费的金额
		定义int sj为随机立减的金额
		输出最终你需要支付的金额
		注：随机立减额度最大为50*/
		
		double sj = r.nextInt(50);			//指定随机数范围0-49
		sj = (sj+1)*0.01*a;					/*确定随机数范围0.01-50，
											当支付金额小于50时，控制
											立减金额不会超过支付金额50%*/
		if(a>50) {							//当消费金额超过
			sj = r.nextInt(50) + 1;			//控制随机数最大为50
		}
		System.out.println("随机立减额度为" + sj);	//输出随机立减额度
		System.out.println("最终支付金额：" + (a - sj));	//输出最终支付金额		
	}
}
