package day05;

import java.util.Scanner; //调用Scanner工具

public class ScannerDemo01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); //从键盘接收数据
		System.out.println("请输入年龄:");
		int age = scan.nextInt();	//next方式接收整型变量
		System.out.println(age);	//输出输入值
	/*估计也就这样了。我再顺带给拓展一下吧*/
		if(scan.hasNext()) {		
	//如果还有输入则继续获取,若需要多次循环输入输出则将if替换成while即可
			int scan1 = scan.nextInt();
			System.out.println(scan1);
		}
		scan.close(); 
	//结束获取用户输入值，如果将if改为while循环，则将不会运行至此。
	}
}
