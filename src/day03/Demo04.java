package day03;

import java.util.Random;//导入java"Random"工具(方法)，

public class Demo04 {
	public static void main(String args[]) {
		//如何控制随机数范围在5-20
		Random r = new Random();  		//创建一个随机数方法命名为r
		int a = r.nextInt(16);	   		 //指定随机数范围0-15
		System.out.println(a);	  		//输出变量a的值
		System.out.println(a + 5);		//输出5-20范围的随机数
	}
}
	