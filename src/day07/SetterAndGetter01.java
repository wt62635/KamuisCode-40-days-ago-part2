package day07;
//��ϰʹ��setter��getter����дһ������
public class SetterAndGetter01 {
		private String People ;
		private String Job ;
		private int num ;
		private int age ;	
		public SetterAndGetter01() {
		}
	public String getPeople(){//��getter����ȡ������
		return People ;
	}
	public void setPeople(String People) {//��setter������������
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
		n1.setPeople("�����߻�Ա");
		n1.setJob("�ϰ���");
		n1.setNum(50);
		n1.setAge(30);
		System.out.println(n1.getPeople() + "||" + n1.getJob() + "||" + n1.getNum() + "||" + n1.getAge());
	}
}

