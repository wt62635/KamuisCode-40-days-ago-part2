public class ExcceptionDemo02 {
	public static void main(String[] args) {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("输出"+i+"行");
					int a = 1/i;					
				}catch(ArithmeticException e1) {
					System.out.println("出现除0异常！");//仅1次，后续操作继续执行
					e1.getMessage();
				}
		}
	}
}