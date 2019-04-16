package javaday12;

interface A{		//抽象类
	void print();
}

class B implements A {		//子类继承
	public void print() {
		System.out.println("Hello World");
	}
}

public class AbstractCaseDemo01 {
	public static void main(String[] args) {
		A a = new B();	//抽象类或接口可通过子类向上转型实例化
		a.print();
	}
}
