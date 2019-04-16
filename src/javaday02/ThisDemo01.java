package javaday02;

class People{
	private String name ;
	private int age ;
	public People() {	//无参构造
	}
	public People(String name , int age ) {
		name = name ;
		age = age ;
	}
	public String getInfo(){
		return "姓名：" + name + ",年龄：" + age ;
	}
}

public class ThisDemo01 {
	public static void main(String[] args) {
		People P1 = new People("Kamui",25);
		System.out.println(P1.getInfo());
	}
}
