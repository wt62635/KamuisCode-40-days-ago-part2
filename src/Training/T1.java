package Training;

interface A{
	 
 }

class F {
	public F() {
		System.out.println("F已创建");
	}
}

abstract class D {
	abstract void print();
}

class C extends F {
	public C() {
		System.out.println("C已创建");
	}
}

public class T1 {
	public static void main(String[] args) {
		F f = new F();
		C c = new C();
	}
}
