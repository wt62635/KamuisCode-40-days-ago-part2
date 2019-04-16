package javaday06;
//正确写法
import java.util.Scanner;

public class LoginInnerClassDemo02 {
	//主启用方法，业务处理下面2者选其1
	public static void main(String[] args) {
		/**main方法将业务交由Run类负责指挥工作-start*/
//		new Run().begin();
		/**main方法将业务交由Run类负责指挥工作-end*/

		/**或者**/

		/**main方法直接负责指挥工作-start*/
		//1.获取信息
		Login login = new InputData().dataInfo();
		//2.检查信息，并打印结果
		CheckAndConfirm checkAndConfirm = new CheckAndConfirm();
		checkAndConfirm.printInfo(login);
		/**main方法直接负责指挥工作-end*/
	}

	//内部信息类，职责：仅封装信息
	static class Login {
		private String userName ;
		private String passWord ;
		private int userCode ;

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

		public int getUserCode() {
			return userCode;
		}

		public void setUserCode(int userCode) {
			this.userCode = userCode;
		}
	}

	//信息获取类，职责：获取输入信息
	static class InputData{
		public Login dataInfo() {
			Scanner sc = new Scanner(System.in);
			System.out.println("用户名：");
			String userName = sc.nextLine();
			System.out.println("密码：");
			String passWord = sc.nextLine();
			System.out.println("编号");
			Integer userCode = sc.nextInt();
			Login login = new Login();
			login.setPassWord(passWord);
			login.setUserName(userName);
			login.setUserCode(userCode);
			return login;
		}
	}

	//信息检查类，职责：判断信息是否正确,及显示判断结果
	static class CheckAndConfirm{

		//功能：显示判断结果
		public void printInfo(Login data) {	//确认信息，反馈结果
			System.out.println("正在确认...");
			if(confirm(data)) {
				System.out.println("确认成功");
				System.out.println(data+",欢迎回来");
			}else {
				System.out.println("确认失败");
				System.out.println("信息有误，程序已结束");
				System.exit(1);
			}
		}

		//功能：判断是否正确
		private boolean confirm(Login data){	//验证信息
			if("Kamui".equals(data.getUserName())
					&&  "Subaru".equals(data.getPassWord())
					&&  data.getUserCode()==100) {
				return true  ;
			}else {
				return false ;
			}
		}
	}

	//业务运行类，职责：用以执行业务(指挥)
	static class Run{
		//执行方法
		public void begin(){
			/**如果不用此类，以下代码就可以直接写在main方法中-start*/
			//1.获取信息
			Login login = new InputData().dataInfo();
			//2.检查信息，并打印结果
			CheckAndConfirm checkAndConfirm = new CheckAndConfirm();
			checkAndConfirm.printInfo(login);
			/**如果不用此类，以下代码就可以直接写在main方法中-end*/
		}
	}
}
