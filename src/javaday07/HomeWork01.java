package javaday07;
//封装一个方法generateArray，
//该方法实现生成指定长度的int数组，
//该数组的元素为0到指定范围内的随机数，
//并将该数组返回。
public class HomeWork01 {
	public static void main(String... args) {
		getArr(5);
	}
	private static int[] getArr(int y) {	//取得一个指定长度元素随机赋值的int数组
		int [] x = new int [y] ;			//创建一个数组
		for(int i = 0 ; i<x.length ; i ++ ) {
			x[i] = (int)(Math.random()*100);
			System.out.println(x[i]);
		}
		return x  ;
	}
}
