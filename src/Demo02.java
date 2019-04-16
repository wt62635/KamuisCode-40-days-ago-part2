//泛型
public class Demo02 <T1,T2>{//可以通过<...，...>方式声明一个或多个泛型
	private T1 over1;//泛型也是一种数据类型，所以也可以进行权限修饰
	private T2 over2;
	
	public T1 getOver1() {
		return over1;
	}
	public void setOver1(T1 over1) {
		this.over1 = over1;
	}
	public T2 getOver2() {
		return over2;
	}
	public void setOver2(T2 over2) {
		this.over2 = over2;
	}
	public static void main(String[] args) {
		Demo02<Boolean,Boolean> d2 = new Demo02<Boolean,Boolean>();
		//通过实例化对象时，给泛型指定数据类型。
		d2.setOver1(true);
		d2.setOver2(false);
		boolean b1= d2.getOver1();
		boolean b2= d2.getOver2();
		
		Demo02<Integer,Integer> d3 = new Demo02<>();
		//指定泛型时可以只写一次，后面的<>可以不写，程序会自动识别。
		d3.setOver1(123);
		d3.setOver2(456);
		int i1 = d3.getOver1();
		int i2 = d3.getOver2();
		
		System.out.println(b1 + "," + b2);
		System.out.println(i1 + "," + i2);
	}
}
