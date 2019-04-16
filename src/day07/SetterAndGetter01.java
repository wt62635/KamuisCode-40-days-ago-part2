package day07;
//练习使用setter和getter方法写一个程序。
public class SetterAndGetter01 {
		private String People ;
		private String Job ;
		private int num ;
		private int age ;	
		public SetterAndGetter01() {
		}
	public String getPeople(){//用getter方法取得数据
		return People ;
	}
	public void setPeople(String People) {//用setter方法设置数据
		this.People = People ;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String Job) {
		this.Job = Job ;
	}
	public int getNum() {
		return num ;
	}
	public void setNum(int num) {
		this.num = num ;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age ;
	}
	public static void main(String args[]) {
		SetterAndGetter01 n1 = new SetterAndGetter01();
		n1.setPeople("工作者会员");
		n1.setJob("上班族");
		n1.setNum(50);
		n1.setAge(30);
		System.out.println(n1.getPeople() + "||" + n1.getJob() + "||" + n1.getNum() + "||" + n1.getAge());
	}
}

