package TestCollection;


class AA{
	public long print() {
		return 5 ;
	}
}

class BB extends AA {
	public int print() {
		return 6;
	}
}

public class TestObject {
	public static void main(String[] args) {
		AA a = new BB();
		System.out.println(a.print());
		}	
}
