package Collection;

public class Demo02<T> {//T不代表任何类型，即为泛型。
	T over;
	
	public T getOver() {
		return over;
	}

	public void setOver(T over) {
		this.over = over;
	}

	public static void main(String[] args) {
		Demo02<String> d1 = new Demo02<>();
		Demo02<Boolean> d2 = new Demo02<>();
		d1.setOver("Kamui");
		String k = d1.getOver();
		System.out.println(k);
		
		
	}
	
}
