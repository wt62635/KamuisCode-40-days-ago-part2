package javaday07;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char p2[] = new char[] {'k','a','m','u','i'};
		String inPut = sc.nextLine();
		char p1[] =  inPut.toCharArray();
		/*for (int i = 0; i < p1.length; i++) {
			System.out.print(p1[i] + "\t");
			System.out.println(p1.length);
		}*/
		if(p1.equals(p2)) {
			System.out.println("ok");
		}else {
			System.out.println("not ok");
		}
	}
}
