package javaday04;
import java.util.Scanner;
//实践2：继续添加功能

/*分析思路：
1.需要添加一个可选择注册账号的功能；
2.需要添加一个可选择重置密码的功能；*/

/*程序属性解析：
1.需要在程序运行时提示可选择登录、注册、重置密码；
2.创建2个类，1个用于初次注册账号，1个用于重置密码；*/

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
class ResetPassWord{	//重置密码方法
	
}

class Regist{			//注册账号方法
	
}

public class LearnAgain01 {
	public static void main(String[] args) {//用户客户端
		
		Login login = new Login(null,null);//执行Login类构造方法
		System.out.println("Mission Complete!");
	}
}
