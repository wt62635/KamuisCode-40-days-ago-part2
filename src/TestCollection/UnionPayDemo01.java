package TestCollection;
/*构造一个银行账户类，类的构成包括如下内容:
 * 1.数据成员的用户的账户名称，用户的账户余额（private数据类型）
 * 2.方法包括开户（设置账户名称及余额），利用构造方法完成。
 * 3.查询余额。
 */
class Bank{
	private String userName ;
	private double balance ;
	public Bank(String userName,double balance) {
		this.userName = userName ;
		this.balance = balance ;
	}
	public double getBalance() {
		return balance;
	}
	
}
public class UnionPayDemo01 {
	public static void main(String[] args) {
		Bank b1 = new Bank("Kamui",3754.28);
		System.out.println("账户余额：" + b1.getBalance());
	}
}
