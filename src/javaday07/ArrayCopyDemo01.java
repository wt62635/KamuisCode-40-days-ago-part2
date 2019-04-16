package javaday07;
//arrycopy使用方法①
public class ArrayCopyDemo01 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[] = new int[6] ; 
		System.arraycopy(a, 2, b, 1, 3);
		/*a:源数组
		 * 1：源数组的起始下标
		 * b:目标数组
		 * 0:目标数组的起始下标
		 * 4:要复制的元素个数
		 */
		for (int i = 0; i < b.length; i++) {
			System.out.print("\t" + b[i]);
		}
	}
}
