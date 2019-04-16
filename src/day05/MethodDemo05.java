package day05;
//练习用return结束方法
public class MethodDemo05 {
	public static void main(String args[]) {
		System.out.println("前");
		fun(10);
		System.out.println("后");
	}
	public static void fun(int x){
		System.out.println("进");
		if(x==10) {
			return ;//结束方法
		}
		System.out.println("return");//方法结束后就不会输出
	}
}
