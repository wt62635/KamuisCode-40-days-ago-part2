package javaday09;

class Aoo{
	void say(){
		System.out.println("null");
	}
	void say(String name){
		System.out.println("name:" + name);
	}
	void say(int age){
		System.out.println("age:" + age);
	}
	void say(String name , int age){
		System.out.println("name:" + name + ",age:" + age );
	}
	void say(String name , int age , String school){
		System.out.println("name:" + name + ",age:" + age + ",school:" + school);
	}
	void say(String name , String school){
		System.out.println("name:" + name + ",school:" + school);
	}
	
}

public class OODemo01 {
	public static void main(String[] args) {
		Aoo a = new Aoo();
		a.say();
		a.say(10);
		a.say("Kamui");
		a.say("Kamui",10);
		a.say("Kamui",10,"T1");
		a.say("Kamui","T1");
	}
}
