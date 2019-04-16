package Training;
//完成1+2+3+4+5+….+100，并输出结果。
public class RecursionDemo2 {
	public static void main(String[] args) {
		System.out.println(result(100));
	}
	public static int result(int x){//+2+3+4.....+93+94+95+96+97+98+99+100
		if(x==1) {
			return 1;
		}
		else {
			return result(x-1)+x;
		}
	}
}
