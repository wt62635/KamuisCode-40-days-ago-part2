package day05;
//一位数组，数组的排序
public class NumGroup03 {
	public static void main(String args[]) {
		int num[] = {55,88,66,99,77,88,44,22};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(num[i]<num[j]) {//交换用循环，如果i比j小则执行以下循环
					//如：55<88，则将55赋给temp，后将j的88赋给i，再将temp的55赋给j，继续执行循环。
					int temp = num[i] ; //这是中间变量,将i取得值赋给temp保存
					num[i] = num[j] ;	//将j取得的值交给i，
					num[j] =  temp ;	//将temp的值赋给j。
				}
			}//通过双循环，将在遍历数组元素的同时修改每个堆内存中的元素，来达成排序的效果。
		}
		for (int i = 0; i < num.length; i++) {	//遍历数组循环输出。
			System.out.print(num[i] + "\t");	
		}
	}
}
