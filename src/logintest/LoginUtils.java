package logintest ;
/**
 * 登录工具，对登录信息进行处理
 */
public class LoginUtils {

    /**
     * 封装登录处理逻辑，供外部使用，因此使用public
     */
    public void loginHandler(Login login) {  //校验程序构造方法
        //开始校验
        System.out.println("正在核实您输入的用户名及密码，请稍后....");
        if (confirm(login)) {
            System.out.println("账号确认，" + login.getUserName() + ",欢迎使用。");
        } else {
            System.out.println("错误：账号或密码错误，已退出程序。");
            System.exit(1);
        }
    }

    /**
     * 检测方法,仅自身内部使用，因此使用private。
     * @param login 登录信息对象
     * @return
     */
    private boolean confirm(Login login) {
        if (login.getUserName().equals("Kamui001") && login.getPassWord().equals("Subaru001")) {
            return true;
        } else {
            return false;
        }
    }

}
