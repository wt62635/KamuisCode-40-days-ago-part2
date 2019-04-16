package TestCollection;
/*编写一个公司员工类
 * 1.数据成员：员工号，姓名，薪水，部门。
 * 2.方法：
 * ①利用构造方法完成设置信息：
 * 单参：只传递员工号，则员工姓名=无名氏，薪水=0，部门=无部门
 * 双参：传递员工号，姓名。则员工薪水为1000，部门=后勤
 * 4参：传递员工号，姓名，薪水，部门
 * 无参：则均为空值
 * ②显示信息
 */
class Worker{
	private int code ;
	private String name ;
	private int salary ;
	private String department ;
	public Worker() {
	}
	public Worker(int code) {
		this.code = code ;
		this.name = "无名氏";
		this.salary = 0 ;
		this.department = "无部门";
	}
	public Worker(int code, String name) {
		this.code = code ;
		this.name = name ;
		this.salary = 1000 ;
		this.department = "后勤";
	}
	public Worker(int code, String name, int salary, String department) {
		this.code = code ;
		this.name = name ;
		this.salary = salary ;
		this.department = department ;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}

public class WorkerDemo01 {
	public static void main(String[] args) {
		Worker w1 = new Worker();
		Worker w2 = new Worker(01);
		Worker w3 = new Worker(02,"Kamui");
		Worker w4 = new Worker(03,"Subaru",2000,"开发");
		printInfo(w1);
		printInfo(w2);
		printInfo(w3);
		printInfo(w4);
	}
	public static void printInfo(Worker w0) {
		System.out.println("员工号：" + w0.getCode() 
							+ "\t姓名：" + w0.getName() 
							+ "\t薪水：" + w0.getSalary() 
							+ "\t部门：" + w0.getDepartment());
	}
}
