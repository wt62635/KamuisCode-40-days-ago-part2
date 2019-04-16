package day03;

public class Demo08 {
	public static void main(String args[]) {
	//for循环语句格式：
	//初始化表达式（定义变量）;条件表达式（循环条件）;循环后的操作表达式（修改变量）
		/*for循环的演示
		 * 找出100以内3的倍数
		* 输出1累加到100的和值*/
	//	for (int i = 0; i < 100; i = i + 3) {
	//		System.out.println(i);
	//	}
		for(int j = 1; j <= 100 ; j++) {
			int sum = 0 ;
				sum += j ;					//+=累加
				System.out.println(sum);
		}
	}
}
