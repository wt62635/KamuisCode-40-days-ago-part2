package TestCollection;

/*
 * 定义员工类，具有姓名、年龄、性别属性，并具有构造方法和显示数据方法。
 * 定义管理层类，继承员工类，并有自己的属性职务和年薪。
 * 定义职员类，继承员工类，并有自己的属性所属部门和月薪。
 */

abstract class Menber{
	private String name;
	private int age ;
	private char sex ;
	public Menber(String name, int age ,char sex) {
		this.name = name ;
		this.age = age ;
		this.sex = sex ;
	}
	abstract public void printInfo();
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getSex() {
		return sex;
	}
}

class Manager extends Menber{
	private String duty ;
	private int yearSalary ;
	public Manager(String name, int age, char sex , String duty , int yearSalary) {
		super(name, age, sex);
		this.duty = duty ;
		this.yearSalary = yearSalary ;
	}
	public void printInfo() {
		System.out.println("姓名：" + super.getName() 
						 + "\t年龄:" + super.getAge()
						 + "\t性别:" + super.getSex()
						 + "\t职责:" + this.duty
						 + "\t年薪：" + this.yearSalary);
	}
}

class Staff extends Menber{
	private String department ;
	private int monthSalary ;
	public Staff(String name, int age, char sex , String department , int monthSalary) {
		super(name, age, sex);
		this.department = department ;
		this.monthSalary = monthSalary ;
	}
	public void printInfo() {
		System.out.println("姓名：" + super.getName() 
						 + "\t年龄:" + super.getAge()
						 + "\t性别:" + super.getSex()
						 + "\t部门:" + this.department
						 + "\t月薪：" + this.monthSalary);
	}
}

public class MenberDemo01 {
	public static void main(String[] args) {
		Manager m1 = new Manager("Kamui",25,'♂',"管理",250000);
		Staff s1 = new Staff("Subaru",22,'♀',"开发部",8000);	
		m1.printInfo();
		s1.printInfo();
	}
}
