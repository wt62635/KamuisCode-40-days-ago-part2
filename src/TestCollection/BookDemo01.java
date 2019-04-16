package TestCollection;
/*
 * 声明一个图书类，其数据成员为书名、编号（利用静态变量实现自动编号）、书价、
 * 并拥有静态数据成员册数、记录图书的总册数，在构造方法中利用此静态变量为对象的
 * 编号赋值，在主方法中定义对象数组，并求出总册数。
 */
class Book{
	private String bookName ;
	private int code ;
	private double price ;
	private int inventory ;
	private static int total ;
	public Book(String bookName,double price,int inventory) {
		this.bookName = bookName;
		this.price = price ;
		this.inventory = inventory ;		
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getInventory() {
		return inventory;
	}
	public  void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Book.total = total;
	}
}

public class BookDemo01 {
	public static void main(String[] args) {
		Book book[] = new Book[4];
		book[0] = new Book("Red书",12.50,18);
		book[1] = new Book("White书",15.25,5);
		book[2] = new Book("Black书",5.60,12);
		book[3] = new Book("Blue书",8.80,7);
		Book.setTotal(book[0].getInventory()
						+book[1].getInventory()
						+book[2].getInventory()
						+book[3].getInventory());
		for (int i = 0; i < book.length; i++) {
			book[i].setCode(i+1);
			System.out.println("书名：" + book[i].getBookName() 
								+ "\t编号：" + book[i].getCode() 
								+ "\t书价：" + book[i].getPrice() 
								+ "\t册数：" + book[i].getInventory());
		}
		System.out.println("共有图书："+Book.getTotal()+"本");
	}
}
