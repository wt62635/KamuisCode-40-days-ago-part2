package javaday06;

import java.util.Random;
import java.util.Scanner;

public class ForTestDemo01 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int score = 0 ; //定义成绩整型变量
		int a ;	//声明加法算数整型变量a
		int b ;	//声明加法算数整型变量b
		int c ;
		for(int i = 1 ; i <= 10 ; i ++ ) {	//共循环10次。
			a = rd.nextInt(100);
			b = rd.nextInt(100);
			System.out.println(a + " + " + b + " = ");
			c = sc.nextInt();
			if((a+b)==c) {
				score = score + 10 ;
				System.out.println("OK");
			}else {
				System.out.println("Not OK");
			}
		}
		System.out.println("score = " + score);
	}
}
