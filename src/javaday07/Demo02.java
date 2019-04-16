package javaday07;

public class Demo02 {
	public static void main(String[] args) {
		//1/1+1/2+1/3+....+1/n = ?
		int n = 15 ;
		double sum =  0 ;
		for(int i = 1 ; i<=n ; i++) {
			sum = sum +1/i ;
		}
		System.out.println("sum = " + sum);
	}
}
