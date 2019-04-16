package day06;
//什么是静态代码块
public class Demo05 {
	
	static {
		System.out.println("静态代码块");
	}
	{
		System.out.println("非静态代码块");
	}
	public Demo05(){
		System.out.println("构造方法");
	}
	public void	show() {
			System.out.println("成员方法");
		}
	public static void main(String args[]) {
		Demo05 d = new Demo05();
		d.show();
	}
}
