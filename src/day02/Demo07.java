package day02;

public class Demo07 {
	public static void main(String args[]) {
		//�ж��������ܷ����������
		//�ж��������ܷ���ɵȱ�������
		//�ж��������ܷ���ɵ���������
		//�ж��������ܷ����ֱ��������
		int a = 3 ;
		int b = 4 ;
		int c = 5 ;
		if(a+b>c&&b+c>a&&a+c>b) {
			System.out.println("��������");
		}
		else{
			System.out.println("����������");
		}
		if(a==b&&b==c) {
			System.out.println("�ǵȱ�������");
		}
		else {
			System.out.println("���ǵȱ�������");
		}
		if((a+b>c&&b+c>a&&a+c>b)&&(a==c||a==b||c==b)) {
			System.out.println("�ǵ���������");
		}
		else {
			System.out.println("���ǵ���������");
		}
	}
}
