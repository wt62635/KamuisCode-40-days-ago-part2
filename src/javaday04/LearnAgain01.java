package javaday04;
import java.util.Scanner;
//ʵ��2��������ӹ���

/*����˼·��
1.��Ҫ���һ����ѡ��ע���˺ŵĹ��ܣ�
2.��Ҫ���һ����ѡ����������Ĺ��ܣ�*/

/*�������Խ�����
1.��Ҫ�ڳ�������ʱ��ʾ��ѡ���¼��ע�ᡢ�������룻
2.����2���࣬1�����ڳ���ע���˺ţ�1�������������룻*/

class Login{					//��¼����
	private String userName ;	//��װ�û���
	private String passWord ;	//��װ����
	public Login(String userName,String passWord){
		System.out.println("��ӭʹ�õ�¼����");
		Scanner sc = new Scanner(System.in);	//�����û�����
		System.out.println("�������û�����");
		userName = sc.nextLine();
		System.out.println("���������룺");
		passWord = sc.nextLine();
		System.out.println("���ں�ʵ��������û��������룬���Ժ�....");
		this.userName = userName ;
		this.passWord = passWord ;
		Check check = new Check();	//ʵ���������ü�ⷽ��
		if(check.confirm(this.userName,this.passWord) == true) {
			System.out.println("�˺�ȷ�ϣ�" + this.userName + ",��ӭʹ�á�");
		}else {
			System.out.println("�����˺Ż�����������˳�����");
			System.exit(1);
		}
		}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
class Check{		//��ⷽ��
	public boolean confirm(String userName,String passWord){
		if(userName.equals("Kamui001")&&passWord.equals("Subaru001")){
			return true ;
		}else {
			return false ;
			}
		}
	}
class ResetPassWord{	//�������뷽��
	
}

class Regist{			//ע���˺ŷ���
	
}

public class LearnAgain01 {
	public static void main(String[] args) {//�û��ͻ���
		
		Login login = new Login(null,null);//ִ��Login�๹�췽��
		System.out.println("Mission Complete!");
	}
}
