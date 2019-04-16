package TestCollection;

/*
 * 建立一个人类(Person)和学生类(Student),功能要求如下：
 * 1.Person中包含4个保护型的数据成员name/addr/sex/age,
 * 分别为字符串型、字符串型、字符型及整型，表示姓名、地址、性别和年龄。
 * 用一个4参构造方法、一个两参构造方法、一个无参构造方法、一个输出方法显示4种属性。
 * 2.Student类继承Person类,并增加输出成员math/english存放数学和英语成绩。
 * 用一个6参构造方法、一个两参构造方法、一个无参构造方法和重写输出方法用于显示
 * 6种属性。
 */

class Person01 {
	protected String name ;
	protected String addr ;
	protected char sex ;
	protected int age ;
	public Person01(String name , String addr , char sex , int age) {
		this.name = name ;
		this.addr = addr ;
		this.sex = sex ;
		this.age = age ;
	}
	public Person01(String name , String addr ) {
		this.name = name ;
		this.addr = addr ;	
	}
	public Person01() {
		
	}
	public void printInfo(Person01 p) {
		System.out.println("姓名：" + this.name 
				       + "\t住址：" + this.addr
				       + "\t性别：" + this.sex
				       + "\t年龄：" + this.age);
	}
}

class Student02 extends Person01 {
	protected int math ;
	protected int english ;
	public Student02(String name , String addr , char sex 
					, int age , int math , int  english) {
		super.name = name;
		super.addr = addr;
		super.sex = sex ;
		super.age = age ;
		this.math = math ;
		this.english = english ;
	}
	public Student02(int math , int english) {
		this.math = math ;
		this.english = english ;
	}
	public Student02() {
	}
	public void printInfo(Student02 s) {
		System.out.println("姓名：" + this.name 
			       + "\t住址：" + this.addr
			       + "\t性别：" + this.sex
			       + "\t年龄：" + this.age
			       + "\t数学成绩：" + this.math
			       + "\t英语成绩：" + this.english);
	}	
}

public class PersonAndStudent {
	public static void main(String[] args) {
		Person01 p1 = new Person01("Kamui01","World01",'♂',18);
		Person01 p2 = new Person01("Kamui02","World01");
		Person01 p3 = new Person01();
		Student02 s1 = new Student02("Subaru01","World02",'♀',17,98,99);
		Student02 s2 = new Student02(96,97);
		Student02 s3 = new Student02();
		p1.printInfo(p1);
		p2.printInfo(p2);
		p3.printInfo(p3);
		s1.printInfo(s1);
		s2.printInfo(s2);
		s3.printInfo(s3);
	}
}
