package day03;

import java.util.Random;//����java"Random"����(����)��

public class Demo04 {
	public static void main(String args[]) {
		//��ο����������Χ��5-20
		Random r = new Random();  		//����һ���������������Ϊr
		int a = r.nextInt(16);	   		 //ָ���������Χ0-15
		System.out.println(a);	  		//�������a��ֵ
		System.out.println(a + 5);		//���5-20��Χ�������
	}
}
	