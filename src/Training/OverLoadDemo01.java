package Training;

public class OverLoadDemo01 {
	public static void main(String[] args) {
		int a = 0,b = 0,c =0,d = 0;
		print(a);
		print(a,b);
		print(a,b,c);
		print(a,b,c,d);
		
	}
	public static void print(int a) {
		System.out.println("传入1个参数");
	}
	public static void print(int a,int b ) {
		System.out.println("传入2个参数");
	}
	public static void print(int a,int b ,int c) {
		System.out.println("传入3个参数");
	}
	public static void print(int a,int b,int c,int d) {
		System.out.println("传入4个参数");
	}
}
