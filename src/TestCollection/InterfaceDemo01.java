package TestCollection;

/*
 * 定义一个ClassName接口，就口中只有一个抽象方法getClassName();
 * 设计一个类Company,该类实现接口ClassName中的方法getClassName(),
 * 功能是获取该类的类名称；编写应用程序使用Company类。
 */

interface ClassName {
	abstract void getClassName();
}

class Company implements ClassName{
	@Override
	public void getClassName() {
		System.out.println(getClass());
	}	
}

public class InterfaceDemo01 {
	public static void main(String[] args) {
		Company c = new Company();
		c.getClassName();
	}
}
