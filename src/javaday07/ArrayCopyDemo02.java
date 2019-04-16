package javaday07;
import java.util.Arrays;	//声明数组复制工具
//
public class ArrayCopyDemo02 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		/*a:源数组
		 * b:目标数组
		 * 6:目标数组的长度（元素个数）
		 */
		int b[] = Arrays.copyOf(a, 8);
		//数组扩容+1
		 a = Arrays.copyOf(a, a.length + 1);
		 
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
