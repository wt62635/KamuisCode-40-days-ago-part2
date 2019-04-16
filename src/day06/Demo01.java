package day06;
//如何创建一个对象
	class Person01{
		String name;	//声明成员变量
		int age;		//声明成员变量
		public void tell() {	//用于取得信息
			System.out.println("姓名:" + name +",年龄:" + age);
		}
	}
	public class Demo01{
		//定义了一个类，但不能直接使用，需要产生对象。
		public static void main(String args[]) {
			Person01 P1 = new Person01();	//由此创建并实例化对象
	}
}
//类属于引用传递类型，从数组的创建过程中可以知道，引用数据类型必然存在栈内存→堆内存的引用关系。
//在类与对象的使用上同样存在这种关系。