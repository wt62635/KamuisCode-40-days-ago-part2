package oo.day04;

class A {	//父类A
	int a ;
	void show() {//show方法
		System.out.println("这是父类A类show方法"+a);
	}
}

class B extends A {	//子类B继承父类A
	int b ;		//B类成员变量
	void show() {//方法重写
		System.out.println("这子类B类show方法"+a);
	}
}

class C extends A {//子类C继承父类A
	int c ;//C类成员变量
	void show() {//方法重写
		System.out.println("这是子类B类show方法"+a);
	}
}

public class Demo01 {
	public static void main(String[] args) {
		A a = new A();	//声明父类A类的对象名为a,通过父类A实例化对象a
		a.a = 12;
		a.show();		//调用A类中show方法输出内容
		/** 父类A的对象a,使用自身A类中的属性和方法*/
		A a1 = new B(); //声明父类A类的对象名为a1,通过子类B实例化对象a1  ← 向上转型
		a1.a = 13;
		a1.show();		//调用B类中show方法输出内容
		/** 父类A的对象a1,使用子类B类中的属性和方法*/
		A a2 = new C(); //声明父类A类的对象名为a2,通过子类C实例化对象a2  ← 向上转型
		a2.show();		//调用C类中show方法输出内容
		/** 父类A的对象a2,使用子类C类中的属性和方法*/
	}
}
