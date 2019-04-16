package day06;
//面向对象的基础理解
	class Person{		//定义一个Person类
		String name;	//声明一个类中的字符串属性成员变量
		int age;		//声明一个类中的整型数值成员变量
		public void tell() {	//定义一个用于取得信息的方法
			System.out.println("姓名:" + name +",年龄:" + age);
		}//方法为输出Person类中对象的name和age属性内容。
	}
	public class Demo02{
		public static void main(String args[]) {
			Person P1 = null;	//为类声明一个对象，为对象开辟一个栈内存并保存其中，且堆内存指向为空。
			Person P2 = null;
			P1 = new Person();	//实例化一个对象，为其栈内存开辟一个对应的堆内存空间，且属性为默认值。
			P2 = new Person();
			P1.name = "Acer" ;	//调用对象字符串属性并赋值
			P2.name = "Bog" ;	
			P1.age = 30 ;		//调用对象整型变量属性并赋值
			P2.age = 3 ;		
			System.out.println("P1对象中的内容→");
			P1.tell();			//调用对象方法并输出
			System.out.println("P2对象中的内容→");
			P2.tell();			
	}
}
