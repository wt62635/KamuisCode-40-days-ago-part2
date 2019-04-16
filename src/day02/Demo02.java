package day02;

public class Demo02 {
	public static void main(String args[]) {
		//演示逻辑运算符&& || ！
		int a = 3 ;						
		int b = 4 ;						//定义整型变量
		int c = 5 ;								
		System.out.println(a>b&&c>b);	//&&(短与)需要所有条件都满足才可输出true。	
		System.out.println(a>b||c>b);	//||（短或）只需要1个条件满足即可输出true。
		System.out.println(!(a>b));     //!（非）需要不满足条件即可输出true。
		//输出结果为false,true,true.
	}
}
