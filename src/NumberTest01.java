//Number抽象类←包装类的父类
public class NumberTest01 {
	public static void main(String[] args) {
		Number num = new Integer(1234);
		System.out.println(num);
		System.out.println(num.intValue());//返回一个int类
		System.out.println(num.floatValue());//返回一个float类
		System.out.println(num.byteValue());//返回一个byte类
	}
}
