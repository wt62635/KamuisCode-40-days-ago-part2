package day07;
public class Student{
		private String number;//ѧ��ѧ��
		private String name;//ѧ������
		private int grade;//ѧ���ɼ�
		public Student(){
		}
		public String getNumber(){//��get�����õ�ѧ��(��ͬ)
			return number;
		}
		public void setNumber(String number){//��set����ȥ����ѧ��(��ͬ)
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
	st.setName("С��");
	st.setGrade(100);
	System.out.println("ѧ��Ϊ��"+st.getNumber()+","+"����Ϊ��"+st.getName()+","+"�ɼ�Ϊ��"+st.getGrade()+"��");
  }
}
