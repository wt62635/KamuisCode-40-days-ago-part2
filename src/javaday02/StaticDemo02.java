package javaday02;
//static使用方法举例
class Demo{
	private String name ;
	private static int count = 0 ;	//所有对象共享此属性
	public Demo() {
		count++ ;						//每当方法实例化一次，则计数
		this.name = "自动编名-" + count ;	//自动编名操作
	}
	public Demo(String name) {
		this.name = name ;
	}
	public String getName() {
		return name;
	}
}
public class StaticDemo02 {
	public static void main(String[] args) {
		System.out.println(new Demo().getName());			//使用无参构造方法
		System.out.println(new Demo("Kamui").getName());	//使用有参构造方法
		System.out.println(new Demo().getName());
		System.out.println(new Demo("Subaru").getName());
	}
}
