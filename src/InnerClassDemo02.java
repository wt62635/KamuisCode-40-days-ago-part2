
abstract class InnerClassTest01 {
	abstract void print();
}

public class InnerClassDemo02 {
	public static void main(String[] args) {
		new InnerClassTest01() {
			void print() {
				System.out.println("匿名内部类输出");
			}
		}.print();
	}
}
