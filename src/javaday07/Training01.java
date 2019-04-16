package javaday07;

import java.util.Arrays;

//求数组元素最大值并放在最后一个元素的位置
public class Training01 {
	public static void main(String[] args) {
		int arr[] = new int[] {11,22,55,44,88,11,33,22};
		Arrays.sort(arr);//数组升序排序
		int max = arr[arr.length-1];
		for (int t = 0; t < arr.length; t++) {	//遍历数组输出
				System.out.println(arr[t]);
			}
		System.out.println("最大值：" + max);
			}
	}
