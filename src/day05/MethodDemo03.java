package day05;
//��������������á������������Ļ�������
public class MethodDemo03 {
	public static void main(String args[]) {
		int one = addOne(16,52);
		float two = addTwo(5.8f,6.9f);
		System.out.println(one);
		System.out.println(two);
	}
	public static int addOne(int x , int y) {
		int temp = 0 ;
		temp = x + y ;
		return temp ;
	}
	public static float addTwo(float x , float y) {
		float temp = 0 ;
		temp = x + y ;
		return  temp ;
	}
}
