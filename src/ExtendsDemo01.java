class A{
	String name = "  ";
	public void A() {
		this.name = name ;
	}
}

class B extends A{
	String name2 = "abc";
	public void B(String name2) {
		this.name2 = name2 ;
	}
}
public class ExtendsDemo01 {
	public static void main(String[] args) {
		B b = new B("bcd");
	}
}
