package javaday02;
//static�ؼ���
class Person{
	private String name ;
	private int age ;
	private static String country = "A��";
	public static void setCountry(String c) {
		country =c ;
	}
	public Person(String name , int age) {
		this.name = name ;
		this.age = age ;
	}
	public void info() {
		System.out.println(this.name + this.age + this.country);
	}
}

public class StaticDemo01 {
	public static void main(String[] args) {
		Person P1 = new Person("Kamui",25);
		Person P2 = new Person("Subaru",18);
		Person P3 = new Person("Luna",21);
		Person.setCountry("B��");
		
		P1.info();
		P2.info();
		P3.info();
	}
}
