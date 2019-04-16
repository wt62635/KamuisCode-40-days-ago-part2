package javaday12;

interface Window{
	public void open();
	public void close();
	public void activated();	//活动窗口
	public void iconified();	//窗口最小化
	public void deicconified();//恢复窗口大小
	
}
abstract class WindowAdapter implements Window{
	public void open() {
	
	}
	public void close() {
		
	}
	public void activated() {
		//活动窗口
	}
	public void iconified() {
		//窗口最小化
	}
	public void deicconified() {
		//恢复窗口大小
	}
	
}
class WindowImpl extends WindowAdapter{//适配Impl
	public void open() {
		System.out.println("打开窗口");
	}
	public void close() {
		System.out.println("关闭窗口");
	}
}
public class AbstractCaseDemo02{
	public static void main(String[] args) {
		Window win = new WindowImpl();
		win.activated();
		win.open();
		win.close();
		
	}
}