
//throw关键字抛出异常使用方法
public class ThrowsTest02 {
	public static void main(String[] args) {
		int count = -100 ;
		try {
			if(count < 0 ) {
				throw  new ArithmeticException("人员数量是负数：" + count);
			}
			
		}catch(Exception e1){
			e1.printStackTrace();
			System.out.println("捕捉到了异常");
		}finally {
			System.out.println("人数为：" + count);			
		}
	}
}