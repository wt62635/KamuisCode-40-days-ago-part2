package javaday07;

public class Demo01 {
	public static void main(String[] args) {
		//9+99+999+9999+...+9999999999=?
		long sum = 0 ;
		long num = 0 ;
		for(int i = 1 ; i <=10 ; i ++ ) {
			num = num * 10 + 9 ;
			sum += num ;
			System.out.println(sum);
		}
	}
}
