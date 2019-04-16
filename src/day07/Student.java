package day07;
public class Student{
		private String number;//学生学号
		private String name;//学生姓名
		private int grade;//学生成绩
		public Student(){
		}
		public String getNumber(){//用get方法得到学号(下同)
			return number;
		}
		public void setNumber(String number){//用set方法去设置学号(下同)
			this.number=number;
		}
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name=name;
		}
		public int getGrade(){
			return grade;
		}
		public void setGrade(int grade){
			this.grade=grade;
		}
    public static void main(String agrs[]){
	Student st=new Student();
	st.setNumber("010112233");
	st.setName("小明");
	st.setGrade(100);
	System.out.println("学号为："+st.getNumber()+","+"姓名为："+st.getName()+","+"成绩为："+st.getGrade()+"。");
  }
}
