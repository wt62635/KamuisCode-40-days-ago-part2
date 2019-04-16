package day05;
//方法的声明与调用————方法的重载
public class MethodDemo04 {
	public static void main(String args[]) {
		int one = add(16,52);
		float two = add(5.8f,6.9f);
		int three = add(12, 34 , 45);
		double four = add(3.14, 6.28);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
	}
	public static int add(int x , int y) {
		int temp = 0 ;
		temp = x + y ;
		return temp ;
	}
	public static int add(int x , int y , int z) {
		int temp = 0 ;
		temp = x + y + z;
		return temp ;
	}
	public static float add(float x , float y) {
		float temp = 0 ;
		temp = x + y ;
		return  temp ;
	}
	public static double add(double x , double y) {
		double temp = 0 ;
		temp = x + y ;
		return  temp ;
	}
}
