package day06;
//�������Ļ������
	class Person{		//����һ��Person��
		String name;	//����һ�����е��ַ������Գ�Ա����
		int age;		//����һ�����е�������ֵ��Ա����
		public void tell() {	//����һ������ȡ����Ϣ�ķ���
			System.out.println("����:" + name +",����:" + age);
		}//����Ϊ���Person���ж����name��age�������ݡ�
	}
	public class Demo02{
		public static void main(String args[]) {
			Person P1 = null;	//Ϊ������һ������Ϊ���󿪱�һ��ջ�ڴ沢�������У��Ҷ��ڴ�ָ��Ϊ�ա�
			Person P2 = null;
			P1 = new Person();	//ʵ����һ������Ϊ��ջ�ڴ濪��һ����Ӧ�Ķ��ڴ�ռ䣬������ΪĬ��ֵ��
			P2 = new Person();
			P1.name = "Acer" ;	//���ö����ַ������Բ���ֵ
			P2.name = "Bog" ;	
			P1.age = 30 ;		//���ö������ͱ������Բ���ֵ
			P2.age = 3 ;		
			System.out.println("P1�����е����ݡ�");
			P1.tell();			//���ö��󷽷������
			System.out.println("P2�����е����ݡ�");
			P2.tell();			
	}
}
