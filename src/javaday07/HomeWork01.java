package javaday07;
//��װһ������generateArray��
//�÷���ʵ������ָ�����ȵ�int���飬
//�������Ԫ��Ϊ0��ָ����Χ�ڵ��������
//���������鷵�ء�
public class HomeWork01 {
	public static void main(String... args) {
		getArr(5);
	}
	private static int[] getArr(int y) {	//ȡ��һ��ָ������Ԫ�������ֵ��int����
		int [] x = new int [y] ;			//����һ������
		for(int i = 0 ; i<x.length ; i ++ ) {
			x[i] = (int)(Math.random()*100);
			System.out.println(x[i]);
		}
		return x  ;
	}
}
