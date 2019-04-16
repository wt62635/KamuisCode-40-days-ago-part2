package oo.day06;


class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println(name + "运行，i" + i);
		}
	}
}
public class TreadTestDemo01{
	public static void main(String[] args) {
		MyThread m1 = new MyThread("线程A");
		MyThread m2 = new MyThread("线程B");
		m1.start();
		m2.start();
	}
}
