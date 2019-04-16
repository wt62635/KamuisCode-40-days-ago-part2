//枚举的使用方法
interface Season {	//接口
	public static final int SPRING = 1;
	public static final int SUMMER = 2;
	public static final int AUTUMN = 3;
	public static final int WINTER = 4;
}
enum Season02 {	//枚举
	SPRING,SUMMER,AUTUMN,WINTER;
}
public class Demo01 {
	public static void doit(int c) {	//非枚举方法
		switch(c) {
		case Season.SPRING:
			System.out.println("春");
			break;
		case Season.SUMMER:
			System.out.println("夏");
			break;
		case Season.AUTUMN:
			System.out.println("秋");
			break;
		case Season.WINTER:
			System.out.println("冬");
			break;
		}
	}
	public static void doit2(Season02 s) {//枚举方法
		switch(s) {
		case SPRING:
			System.out.println("春");
			break;
		case SUMMER:
			System.out.println("夏");
			break;
		case AUTUMN:
			System.out.println("秋");
			break;
		case WINTER:
			System.out.println("冬");
			break;
		}
	}
	public static void main(String[] args) {
		doit(Season.SPRING);
		doit(Season.SUMMER);
		doit(Season.AUTUMN);
		doit(Season.WINTER);
		//枚举输出
		doit2(Season02.SPRING);
		doit2(Season02.SUMMER);
		doit2(Season02.AUTUMN);
		doit2(Season02.WINTER);
	}
}
