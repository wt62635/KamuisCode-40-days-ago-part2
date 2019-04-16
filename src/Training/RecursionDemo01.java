package Training;
//完成1+2+3+4+5+….+100，并输出结果。
public class RecursionDemo01 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		result(i , sum);
	}
	public static void result(int i, int sum) {
		if(i<100) {
			i++;
			sum += i;
			result(i , sum);
		}else {
			System.out.println(sum);	
		}
	}
}
