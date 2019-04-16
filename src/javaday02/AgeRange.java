package javaday02;

import java.util.Scanner;

public class AgeRange {
	public static void main(String[] args) {
		System.out.println("请输入年龄：");
		Scanner scan = new Scanner(System.in);
		int age =scan.nextInt();
		System.out.println("输入的年龄为：" + age);
	}
}
