
abstract class FreshKeepingFilm{
	abstract void pack();
}

public class Sausage {
	public static void main(String[] args) {
		new FreshKeepingFilm() {

			@Override
			void pack() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类");
			}
			
		}.pack();	//创建匿名对象时，直接在大括号内写方法主体，并在大括号外直接执行。
	}
}
