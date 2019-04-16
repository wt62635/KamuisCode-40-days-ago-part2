package day02;

public class Demo01 {
	public static void main(String[] args) {
		/*++ -- 的演示
		 ++在前就先执行加1再被使用
		 ++在后就先被使用然后才加一*/
		int a = 5 ;							//定义整型变量a，赋值5。	
		a = (a++) - (a--);					// -1(将结果赋值) = 5(运算后对结果+1) - 6(运算后对结果-1)
		System.out.println("第一次a的值=" + a);
		a = a * 2 ;							// 2 = 1 * 2 
		System.out.println("第二次a的值=" + a);
		a = (++a) - a ;						// 0 = (3) - 3
		System.out.println("第三次a的值=" + a);
		System.out.println("第四次a的值=" + --a); //  -1 = 0-1
	}
}
