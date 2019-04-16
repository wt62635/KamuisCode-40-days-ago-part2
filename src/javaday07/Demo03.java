package javaday07;

public class Demo03 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[] = new int[6] ; 
		
		for(int i = 0 ; i < a.length ; i++ ) {
			b[i] = a[i] ;
			System.out.println(b[i] +"-----"+ a[i]);
		}
	}
}
