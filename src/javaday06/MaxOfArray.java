package javaday06;

import java.util.Arrays;

public class MaxOfArray {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int) (Math.random()*100);
		}
		int max = arr[0] ;
		for(int j = 0 ; j < arr.length ; j++) {//
			//System.out.println(arr[j]);
			if( arr[j] > max) {
				max = arr[j];
				//System.out.println("最大值为：" + max);
			}
		}
		arr = Arrays.copyOf(arr, arr.length + 1);//数组扩容+1
		arr[arr.length-1] = max ;			//将最大值赋给最后一个元素
		for (int i = 0; i < arr.length; i++) {
			System.out.println("第" + (i+1) + "次输出：" + arr[i]);
		}
	}
}
