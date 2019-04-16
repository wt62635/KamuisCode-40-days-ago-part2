package oo.day04;

class Goo{
	void  test(Eoo o ) {
		System.out.println("父类型参数");
		o.show();
	}
	void test(Foo o ) {
		System.out.println("子类型参数");
		o.show();
	}
}
class Eoo{
	void show() {
		
	}
}
class Foo extends Eoo{
	void show() {
		
	}
}
//重载与重写
public class Demo02 {
	public static void main(String[] args) {
		Goo goo = new Goo();
		Eoo o = new Foo();	//向上转型
		goo.test(o);
		
	}
}
