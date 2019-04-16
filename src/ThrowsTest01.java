
//抛出中断异常
public class ThrowsTest01 {
	public static void show() throws InterruptedException{
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);//线程休眠1秒
		}
	}
	public static void main(String[] args) {
			try {
				show();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
