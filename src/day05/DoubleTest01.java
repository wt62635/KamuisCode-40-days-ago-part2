package day05;
//�������ɵ��ʽ�ý����С��������ȶ�ʧ������
public class DoubleTest01 {
	public static void main(String args[]) {
		double a =  3.14d;
		double b =  2.50d;
		double c = a*100 - b*100;
		c = c/100 ;
		if ( c == 0.64 ){
			boolean d = true ;
			System.out.println(d);
		} else {
			boolean d = false ;
			System.out.println(d);
		}
		System.out.println("a-b=" + c);
	}
}
