//线程的休眠
public class ThreadDemo02{
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
