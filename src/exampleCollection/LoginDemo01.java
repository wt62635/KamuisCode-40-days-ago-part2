package exampleCollection;

import java.util.Scanner;

class Data{			//用户名密码封装
	private String userName ;
	private String passWord ;
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

class Check{		//验证信息、反馈判断结果
	public void printOut(Data userData){
		System.out.println("正在核实您输入的用户名及密码，请稍后....");
		if(confirm(userData)){
			System.out.println("账号确认：" + userData.getUserName() + "，欢迎使用！");
		}else {
			System.out.println("错误：用户名或密码有误，程序已退出。");
			System.exit(1);
		}
	}

	private boolean confirm(Data userData) {
		if( "Kamui001".equals(userData.getUserName())
				&& "Subaru001".equals(userData.getPassWord())) {
			return true ;
		}else {
			return false ;
		}
	}
}

public class LoginDemo01 {		//客户端输入信息，登录窗口。
	public static void main(String[] args) {
		Data userData = getInfo();		//定义取得信息方法
		
		Check check = new Check();
		check.printOut(userData);
	}	
		private static Data getInfo() {		//接收用户输入信息	
		Data userData = new Data();
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎使用登录程序！");
		System.out.println("请输入用户名:");
		String userName = sc.nextLine() ;
		System.out.println("请输入密码:");
		String passWord = sc.nextLine() ;
		userData.setUserName(userName);
		userData.setPassWord(passWord);
		return userData;		
	}
}
