package day05;
//数组的静态初始化
public class NumGroup02 {
	public static void main(String args[]) {
		int num[] = {55,88,66,99,77,88,44,22};
		int max = 0 ;
		int min = 0 ;
		max = num[0];//把第一个元素的内容赋值给max和min
		min = num[0];//同上
		for (int i = 0; i < num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
			if (num[i]<min) {
				min = num[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
