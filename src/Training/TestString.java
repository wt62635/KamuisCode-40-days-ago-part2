package Training;

public class TestString {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String s;
		for (int i = 0; i < 10000000; i++) {
			s = "测试";
			System.out.println(s);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("用时：" + (end-start) + "ms");
	}
}
//循环外： 28781ms

//循环内： 29205ms