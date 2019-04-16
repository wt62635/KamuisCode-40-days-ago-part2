package day01;

import java.util.Scanner;

public class SwitchDemo02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("感谢使用成绩判断程序，请直接输入数字成绩，或输入888退出程序。");
	Loop :	while(true) {
		int a = input.nextInt();
		System.out.println("您输入的成绩为:" + a);
		if(a<=59 && a>=0) {
			System.out.println("输入的成绩不合格!");
			System.out.println("请继续输入:");
		}
		if(a<=89 && a>=60) {
			System.out.println("输入的成绩合格!");
			System.out.println("请继续输入:");
		}
		if(a>=90 && a<=100) {
			System.out.println("输入的成绩优秀!");
			System.out.println("请继续输入:");
		}
Loop1x1:	if(a<0 || a>100) {
			if( a == 888) {
				break Loop1x1;
			}
			System.out.println("输入的成绩有误，请重新输入！");
		}
		if(a == 888) {
			System.out.println("检测到结束指令"+ "“" + a + "”" +"，请输入数字“1”确认结束程序，或输入其他任意数字返回成绩输入。");
			long b = input.nextInt();
			if(b == 1) {
				System.out.println("检测到“1”确认结束指令，程序结束。");
			break Loop ;
			}
			else {
				System.out.println("未检测到“1”确认结束指令，返回成绩输入。");
				System.out.println("请继续输入:");
			}
		}
		}
	}
}