package javaday02;
import java.util.Scanner;
//实践：登录程序设计

/*分析思路：
1.需要有输入需求提示，分别输入用户名和密码。
2.接收输入的用户名和密码，进入后台进行验证。
3.对用户名和密码进行核实，将结果反馈用户。*/

/*程序属性解析：
1.需要封装的属性有2个，用户名和密码。
2.需要的类和构造方法有2个，用户输入方法、验证方法。
3.结果通过主方法输出给用户。*/

class Login{					//登录程序
	private String userName ;	//封装用户名
	private String passWord ;	//封装密码
	public Login(String userName,String passWord){
		System.out.println("欢迎使用登录程序！");
		Scanner sc = new Scanner(System.in);	//接收用户输入
		System.out.println("请输入用户名：");
		userName = sc.nextLine();
		System.out.println("请输入密码：");
		passWord = sc.nextLine();
		System.out.println("正在核实您输入的用户名及密码，请稍后....");
		this.userName = userName ;
		this.passWord = passWord ;
		Check check = new Check();	//实例化并调用检测方法
		if(check.confirm(this.userName,this.passWord) == true) {
			System.out.println("账号确认，" + this.userName + ",欢迎使用。");
		}else {
			System.out.println("错误：账号或密码错误，已退出程序。");
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
class Check{		//检测方法
	public boolean confirm(String userName,String passWord){
		if(userName.equals("Kamui001")&&passWord.equals("Subaru001")){
			return true ;
		}else {
			return false ;
			}
		}
	}

public class LoginDemo01 {
	public static void main(String[] args) {//用户客户端
		Login login = new Login(null,null);//执行Login类构造方法
		System.out.println("Mission Complete!");
	}
}
