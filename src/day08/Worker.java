package day08;

public class Worker {
	private int age1 ;
	private String name1 ;
	public Worker(int age ,String name){
		age1 = age ;
		name1 = name ;
	}
	public int getAge() {
		return age1;
	}
	public void setAge(int age) {
		age1 = age;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		name1 = name;
	}
}
