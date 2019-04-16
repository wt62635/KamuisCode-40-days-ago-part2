package Training;

class AA{
	public AA print() {
		return null;
	}
}

class BB extends AA{
	public AA print() {
		return null;
	}
}

class CC extends BB{
	public CC print() {
		return null;
	}
}

public class Num011{
	public static void main(String[] args) {
		AA aa = new BB();
		AA result = aa.print();
	}
}
