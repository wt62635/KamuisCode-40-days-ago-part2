package javaday06;
//通过递归操作完成1累加至100的结果输出。
public class DiGuiDemo01 {
	public static void main(String[] args) {
		System.out.println(sum(100));
	}
	public static int sum(int num) {
		if(num == 1) {
			return 1 ;
		}else {
			return num + sum(num - 1);
		}
	}
}
