package day04;

public class ThisTest {
	String name = "abc";
	
	public void showName(String name) {
		System.out.println(name);
	}
	
	public static void main(String args[]) {
		ThisTest b = new ThisTest();
		b.showName("123");
	}
}
