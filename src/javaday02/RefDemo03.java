package javaday02;
//引用与传递
/*class Person{
	private String name ;
	private int age ;
	private Person Father ;					//定义一个人为父亲
	private Person Child  ;					//定义一个人为孩子
	private Item item ;						//定义一个人有一个物品
	public Person(String name,int age) {	//定义构造方法
		this.name = name ;
		this.age = age ;
	}
	public Item  getItem() {
		return item ;
	}
	public void setItem(Item item) {
		this.item = item ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person getFather() {
		return Father;
	}
	public void setFather(Person father) {
		Father = father;
	}
	public Person getChild() {
		return Child;
	}
	public void setChild(Person child) {
		Child = child;
	}	
}
class Item{
	private String maker ;
	private String code ;
	private Person child ;
	private Person father ;
	private Item playStation ;
	private Item gameBoy ;
	public Item(String maker,String code) {	//定义构造方法
		this.maker = maker ;
		this.code = code ;
	}
	public Person getChild() {
		return child;
	}
	public void setChild(Person child) {
		this.child = child;
	}
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public Item getPlayStation() {
		return playStation;
	}
	public void setPlayStation(Item playStation) {
		this.playStation = playStation;
	}
	public Item getGameBoy() {
		return gameBoy;
	}
	public void setGameBoy(Item gameBoy) {
		this.gameBoy = gameBoy;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
public class RefDemo03{
	public static void main(String[] args) {
		Person father = new Person("Kamui",25);		//实例化一个父亲对象
		Person child = new Person("Subaru",10);		//实例化一个孩子对象
		Item I1 = new Item("Sony","Ps4");			//实例化一个物品1号对象
		Item I2 = new Item("Nintendo","GBA");		//实例化一个物品2号对象
		father.setItem(I1);							//设置2个对象关系，父亲有一个物品1号
		child.setItem(I2);							//设置2个对象关系，孩子有一个物品2号
		I1.setFather(father);						//设置2个对象关系，物品1号属于父亲
		I2.setChild(child);							//设置2个对象关系，物品2号属于孩子
		father.setChild(child);						//设置2个对象关系，父亲有一个孩子
		child.setFather(father);					//设置2个对象关系，孩子有一个父亲
		
		System.out.println("从人找到物品：" + "父亲的姓名为" + father.getName() 
		+ "，父亲的年龄为：" + father.getAge() 
		+ "父亲拥有的物品为：" + father.getItem().getMaker() + "的" 
		+ father.getItem().getCode() );
		System.out.println("从人找到物品：" + "孩子的姓名为" + child.getName() 
		+ "，孩子的年龄为：" + child.getAge()
		+ "孩子拥有的物品为：" + child.getItem().getMaker() + "的" 
		+ child.getItem().getCode() );
		System.out.println("从物品找到人：" + "物品的厂家为" + I1.getMaker() 
		+ "，物品的型号为：" + I1.getCode() + "物品属于的对象信息为：" + I1.getFather().getName() 
		+ ",年龄为：" + I1.getFather().getAge());
		System.out.println("从物品找到人：" + "物品的厂家为" + I2.getMaker() 
		+ "，物品的型号为：" + I2.getCode()
		+ "物品属于的对象信息为：" + I2.getChild().getName() 
		+ ",年龄为：" + I2.getChild().getAge() );
	}
}
*/