package day03;

public class NumGroup01 {
	public static void main(String args[]) {
		int num[] = null;	//����һ���������飬ֵΪ��
		num = new int[5];	//Ϊ���鿪��5�����ڴ�ռ䡣
		for (int y = 0; y < num.length; y++) {	//��������
			num[y] = y * 2 + 1 ;	//Ϊÿ�����ڴ�ռ丳ֵ������ֵ
		} //.length����ȡ������ĳ���
		for (int x = 0; x < num.length; x++) {	//��������
			System.out.println("num["+x+"]=" + num[x]);	//�����������
		}
		System.out.println("����ĳ���Ϊ��" + num.length);
	}
}