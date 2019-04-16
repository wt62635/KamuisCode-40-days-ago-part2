package day01;

public class Book {
	public static void main(String args[]) {
		int a = 50;
		int b = 10;
		Book book = new Book();
		System.out.println("a书+b书的和为：" + book.add(a, b) + 
							"本。计算过程如下：a"+ a + "本书，b有"
							+ b + "本书");

	}

	private int add(int a, int b) {
		b = b + a;
		return b;
	}
}
	