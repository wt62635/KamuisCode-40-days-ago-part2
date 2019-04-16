package javaday07;
import java.util.Arrays;
//ArraySort01升序排序方法
public class ArraySort01 {
	public static void main(String[] args) {
		int arr[] = new int[10000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100000000);//随机赋值 *范围
		}
		
		long a = System.currentTimeMillis();
		Arrays.sort(arr);	//升序排列
		long b = System.currentTimeMillis();
		/*for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}*/
		System.out.println("排序所用时间 = " + (b-a) + "毫秒");
	}
}
