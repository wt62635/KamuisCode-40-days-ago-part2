package day02;

public class Demo01 {
	public static void main(String[] args) {
		/*++ -- ����ʾ
		 ++��ǰ����ִ�м�1�ٱ�ʹ��
		 ++�ں���ȱ�ʹ��Ȼ��ż�һ*/
		int a = 5 ;							//�������ͱ���a����ֵ5��	
		a = (a++) - (a--);					// -1(�������ֵ) = 5(�����Խ��+1) - 6(�����Խ��-1)
		System.out.println("��һ��a��ֵ=" + a);
		a = a * 2 ;							// 2 = 1 * 2 
		System.out.println("�ڶ���a��ֵ=" + a);
		a = (++a) - a ;						// 0 = (3) - 3
		System.out.println("������a��ֵ=" + a);
		System.out.println("���Ĵ�a��ֵ=" + --a); //  -1 = 0-1
	}
}
