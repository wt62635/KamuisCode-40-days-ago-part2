package oo.day01;

class Person{		//人类
	private String name ;
	private int age ;
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

class T1{		//T1类
	private String name ;
	private int age ;
	private String school ;
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
}
class LowLevel extends T1{	//继承T1类
}

class HighLevel extends LowLevel{//继承LowLevel类(多层继承)
}

public class ExDemo01 {
	//extends 继承（扩展）关键字
	//子类（派生类）继承父类可以扩展已有类的功能
	public static void main(String[] args) {
		LowLevel ll = new LowLevel();
		ll.setName("KK");
		ll.setAge(15);
		ll.setSchool("T1");
		HighLevel hl = new HighLevel();
		hl.setName("SS");
		hl.setAge(18);
		hl.setSchool("T1");
	}
}
