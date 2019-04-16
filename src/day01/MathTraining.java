package day01;

public class MathTraining {
	public static void main(String args[]) {
		int n = 65481 ;
		int x = n / 10000 ;			//得出万位
		int a = (n / 1000) % 10 ;	//得出千位
		int b = (n / 100) % 10 ;	//得出百位
		int c = (n / 10 ) % 10 ; 	//得出十位
		int d = n %10 ;				//得出个位
		System.out.println("数的万位为"+ x 
							+ "，数的千位为"+ a 
							+ "，数的百位为" + b 
							+ "，数的十位为" + c 
							+ "，数的个位为" + d);
	}
}
