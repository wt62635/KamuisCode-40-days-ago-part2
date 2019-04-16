
public class ThreadDemo01 {
	public static void main(String[] args) {
		ThreadA t = new ThreadA();
		t.start();
	}
}

class ThreadA extends Thread{
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);//休眠1秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}