package day03;

import java.util.Random;

public class Demo05 {
	public static void main(String args[]) {
		//��ϰ�⣺ģ��֧�����������
		Random r = new Random();
		int  a = 1;					//����֧�����Ϊ1
		/*Ҫ��
		����int a Ϊ���ѵĽ��
		����int sjΪ��������Ľ��
		�����������Ҫ֧���Ľ��
		ע���������������Ϊ50*/
		
		double sj = r.nextInt(50);			//ָ���������Χ0-49
		sj = (sj+1)*0.01*a;					/*ȷ���������Χ0.01-50��
											��֧�����С��50ʱ������
											�������ᳬ��֧�����50%*/
		if(a>50) {							//�����ѽ���
			sj = r.nextInt(50) + 1;			//������������Ϊ50
		}
		System.out.println("����������Ϊ" + sj);	//�������������
		System.out.println("����֧����" + (a - sj));	//�������֧�����		
	}
}
