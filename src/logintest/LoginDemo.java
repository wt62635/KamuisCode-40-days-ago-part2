package logintest ;

import java.util.Scanner;

/**
 * 主程序，程序启动入口，同时获取外部输入信息
 */
public class LoginDemo {

    public static void main(String[] args) {

        //1.获取登录信息
        Login login = getInputInfo();

        //2.处理登录
        LoginUtils loginUtils = new LoginUtils();
        loginUtils.loginHandler(login);
    }

    /**
     * 获取输入参数，并封装成Login对象信息返回
     * @return
     */
    private static Login getInputInfo(){
        //主获取信息进行封装-start
        System.out.println("欢迎使用登录程序！");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = sc.nextLine();
        System.out.println("请输入密码：");
        String passWord = sc.nextLine();
        Login login = new Login();
        login.setUserName(userName);
        login.setPassWord(passWord);
        //获取信息进行封装-end
        return login;
    }
}
