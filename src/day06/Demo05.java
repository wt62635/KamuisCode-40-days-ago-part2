package day06;
//ʲô�Ǿ�̬�����
public class Demo05 {
	
	static {
		System.out.println("��̬�����");
	}
	{
		System.out.println("�Ǿ�̬�����");
	}
	public Demo05(){
		System.out.println("���췽��");
	}
	public void	show() {
			System.out.println("��Ա����");
		}
	public static void main(String args[]) {
		Demo05 d = new Demo05();
		d.show();
	}
}
