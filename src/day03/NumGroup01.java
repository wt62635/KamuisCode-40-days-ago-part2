package day03;

public class NumGroup01 {
	public static void main(String args[]) {
		int num[] = null;	//声明一个整型数组，值为空
		num = new int[5];	//为数组开辟5个堆内存空间。
		for (int y = 0; y < num.length; y++) {	//遍历数组
			num[y] = y * 2 + 1 ;	//为每个堆内存空间赋值奇数数值
		} //.length用于取得数组的长度
		for (int x = 0; x < num.length; x++) {	//遍历数组
			System.out.println("num["+x+"]=" + num[x]);	//输出数组内容
		}
		System.out.println("数组的长度为：" + num.length);
	}
}