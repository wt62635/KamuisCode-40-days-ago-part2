package day01;

import java.util.Scanner;

public class SwitchDemo02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��лʹ�óɼ��жϳ�����ֱ���������ֳɼ���������888�˳�����");
	Loop :	while(true) {
		int a = input.nextInt();
		System.out.println("������ĳɼ�Ϊ:" + a);
		if(a<=59 && a>=0) {
			System.out.println("����ĳɼ����ϸ�!");
			System.out.println("���������:");
		}
		if(a<=89 && a>=60) {
			System.out.println("����ĳɼ��ϸ�!");
			System.out.println("���������:");
		}
		if(a>=90 && a<=100) {
			System.out.println("����ĳɼ�����!");
			System.out.println("���������:");
		}
Loop1x1:	if(a<0 || a>100) {
			if( a == 888) {
				break Loop1x1;
			}
			System.out.println("����ĳɼ��������������룡");
		}
		if(a == 888) {
			System.out.println("��⵽����ָ��"+ "��" + a + "��" +"�����������֡�1��ȷ�Ͻ������򣬻����������������ַ��سɼ����롣");
			long b = input.nextInt();
			if(b == 1) {
				System.out.println("��⵽��1��ȷ�Ͻ���ָ����������");
			break Loop ;
			}
			else {
				System.out.println("δ��⵽��1��ȷ�Ͻ���ָ����سɼ����롣");
				System.out.println("���������:");
			}
		}
		}
	}
}