package javaday09;

public class Test {
	public static void main(String[] args) {
		Animal am = new Cat();// 向上转型
		am.eat();// 猫吃饭
		am.sleep();// 动物在睡觉
		am.run();// 动物在奔跑
		System.out.println(am.num);// 10
		System.out.println(am.age);// 20
		//am.catchMouse();//报错，子类中独有的方法
		// System.out.println(am.name);//报错，子类中独有的属性

		Cat ct = (Cat) am;// 向下转型
		ct.eat();// 猫吃饭
		ct.sleep();// 猫在睡觉
		ct.run();// 动物在奔跑
		ct.catchMouse();// 猫在抓老鼠
	}

}

class Animal {
	int num = 10;
	static int age = 20;

	public void eat() {
		System.out.println("动物吃饭");
	}

	public static void sleep() {
		System.out.println("动物在睡觉");
	}

	public void run() {
		System.out.println("动物在奔跑");
	}
}

class Cat extends Animal {
	int num = 80;
	static int age = 90;
	String name = "tomCat";

	public void eat() {
		System.out.println("猫吃饭");
	}

	public static void sleep() {
		System.out.println("猫在睡觉");
	}

	public void catchMouse() {
		System.out.println("猫在抓老鼠");
	}

}
/*
 * --------------------- 作者：一缕82年的清风 来源：CSDN
 * 原文：https://blog.csdn.net/lsqingfeng/article/details/80600898
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */