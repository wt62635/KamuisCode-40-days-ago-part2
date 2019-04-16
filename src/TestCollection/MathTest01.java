package TestCollection;
//求13-23+33-43+.....973-983+993-1003的值
public class MathTest01 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			sum += -10;
			System.out.println(sum);
		}
	}
}
