package oo.day03;

public class Student {
	String name;
	int age ;
	String address ;
	
	Student(String name , int age , String address){
		this.name = name ;
		this.age = age ;
		this.address  = address  ;
	}
	Student(String name , int age ){
		this(name,age,null);
	}
	Student(String name){
		this(name,0,null);
	}

	public void print() {
		System.out.println("Hello!");
	}
}
