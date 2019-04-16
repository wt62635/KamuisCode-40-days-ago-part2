
//throw关键字抛出异常使用方法02
public class ThrowsTest03 {
	public static void main(String[] args) {
		try {
			int a = 1,  b  = 0;
			if(b==0) {
				throw new NullPointerException("B=0,发生异常");
			}
			int c = a/b;
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}