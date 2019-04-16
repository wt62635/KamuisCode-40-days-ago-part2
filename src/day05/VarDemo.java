package day05;
//变量的演示
public class VarDemo {
	public static void main(String args[]) {
		int a ;
		int b,c ;
		int d = 25 ;
		int f =  6 ;
		int g =  f + 10 ;
		System.out.println(g);
		int h = 3.14 ;	//整型变量无法定义小数
		System.out.println(i); //无法输出未初始化赋值的变量
		int i ;	
		System.out.println(i);	//无法输出未赋值的变量
		
		int void = 0 ;	//不能声明关键字
		int # = 1 ;		//不能声明特殊符号
		int 12 = a ;	//不能声明数字
		int bad = 0 ;	//正确
		int num = 12 ;	//正确
		int 数字 = 1515;	//正确，但不建议使用中文为变量名。在编译的过程中容易变成乱码。
	}
}
