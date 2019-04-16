package javaday06;
//复习面向对象内容①
class Person{
	private String name ;
	private int age ;
	public void tell() {//访问权限 方法名称():方法返回值
		System.out.println("姓名：" + name + "，年龄：" + age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class ClassDemo01 {
	public static void main(String[] args) {
		Person P1 = new Person();//产生对象P1
		P1.setName("Kamui");
		P1.setAge(25);
		P1.tell();//类和方法不能直接使用，必须要有对象。
	}
}
