package javaday02;

class People{
	private String name ;
	private int age ;
	public People() {	//�޲ι���
	}
	public People(String name , int age ) {
		name = name ;
		age = age ;
	}
	public String getInfo(){
		return "������" + name + ",���䣺" + age ;
	}
}

public class ThisDemo01 {
	public static void main(String[] args) {
		People P1 = new People("Kamui",25);
		System.out.println(P1.getInfo());
	}
}
