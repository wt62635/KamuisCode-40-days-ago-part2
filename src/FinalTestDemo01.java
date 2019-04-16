
//Finally代码块
public class FinalTestDemo01 {
	public static void main(String[] args) {
			try {
				System.out.println("开始执行代码");
				//强制关闭程序则finally不会执行
				//System.exit(1);
			} catch (Exception e1) {
				System.out.println("出现异常");
				e1.getMessage();
		}finally {
			System.out.println("finally继续执行");
		}
	}
}
