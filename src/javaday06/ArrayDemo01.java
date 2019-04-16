package javaday06;
//使用Arrays工具给数组排序
import java.util.Arrays;

public class ArrayDemo01 {
	public static void main(String[] args) {
		
	int x[] = {15,12,56,32,124,6};
	Arrays.sort(x);
	for(int  i= 0; i < x.length ; i++ ) {
		System.out.println(x[i]);
		}
	}
}
