package TestCollection;

//用递归方法得出1累加至1000的结果。
public class RecursionDemo01 {
	public static void main(String[] args) {
		int sum = megaPlus(1) ;
		System.out.println(sum);
	}
	public static int megaPlus(int num) {
		if(num<=1000) {
			return  num + megaPlus(num+1) ;
		}else {
		return 0;
		}
	}
}
