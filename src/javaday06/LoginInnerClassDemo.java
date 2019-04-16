package javaday06;
//内部类练习代码
import java.util.Scanner;

public class LoginInnerClassDemo {
	 static class Login {		//外部类：属性封装
		private String userName ;
		private String passWord ;
		private int userCode ;
		
		public void begin() {		//外部类启动方法
			new InputData().check();
		}

		class InputData {			//一层内部类：用户输入信息
			Login data = dataInfo();
			
			private Login dataInfo() {
				Scanner sc = new Scanner(System.in);
				System.out.println("用户名：");
				userName = sc.nextLine();
				System.out.println("密码：");
				passWord = sc.nextLine();
				System.out.println("编号");
				userCode = sc.nextInt();
				return data ;
			}
			public void check() {
				new CheckAndConfirm().printInfo(data);
			}
			class CheckAndConfirm {		//二层内部类：验证方法
				public void printInfo(Login data) {	//确认信息，反馈结果
					System.out.println("正在确认...");
					if(confirm(data)) {
						System.out.println("确认成功");
						System.out.println(userName+",欢迎回来");
					}else {
						System.out.println("确认失败");
						System.out.println("信息有误，程序已结束");
						System.exit(1);
					}
				}
				private boolean confirm(Login data){	//验证信息
					if("Kamui".equals(userName) 
							&&  "Subaru".equals(passWord)
							&&  userCode==100) {
						return true  ;
					}else {
						return false ;
					}
				}	
			}
		}
	}
	public static void main(String[] args) {	//主方法
		new Login().begin();				//启动登录程序
	}
}
