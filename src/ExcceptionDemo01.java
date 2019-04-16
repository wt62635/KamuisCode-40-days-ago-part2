public class ExcceptionDemo01 {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		try {
			Object obj = null;
			obj.hashCode();				//空指向	
		//	System.out.println(a/b);	除以0
		}catch(ArithmeticException  e1) {
			System.out.println("异常0：出现算数异常，请处理。");
		}catch(NullPointerException e2) {
			System.out.println("异常1：出现空指向异常，请处理。");
		}catch(ClassCastException  e3) {
			System.out.println("异常2：出现类转换异常，请处理。");
		}
	}
}