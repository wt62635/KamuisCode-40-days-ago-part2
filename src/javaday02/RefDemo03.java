package javaday02;
//�����봫��
/*class Person{
	private String name ;
	private int age ;
	private Person Father ;					//����һ����Ϊ����
	private Person Child  ;					//����һ����Ϊ����
	private Item item ;						//����һ������һ����Ʒ
	public Person(String name,int age) {	//���幹�췽��
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
	public Item(String maker,String code) {	//���幹�췽��
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
		Person father = new Person("Kamui",25);		//ʵ����һ�����׶���
		Person child = new Person("Subaru",10);		//ʵ����һ�����Ӷ���
		Item I1 = new Item("Sony","Ps4");			//ʵ����һ����Ʒ1�Ŷ���
		Item I2 = new Item("Nintendo","GBA");		//ʵ����һ����Ʒ2�Ŷ���
		father.setItem(I1);							//����2�������ϵ��������һ����Ʒ1��
		child.setItem(I2);							//����2�������ϵ��������һ����Ʒ2��
		I1.setFather(father);						//����2�������ϵ����Ʒ1�����ڸ���
		I2.setChild(child);							//����2�������ϵ����Ʒ2�����ں���
		father.setChild(child);						//����2�������ϵ��������һ������
		child.setFather(father);					//����2�������ϵ��������һ������
		
		System.out.println("�����ҵ���Ʒ��" + "���׵�����Ϊ" + father.getName() 
		+ "�����׵�����Ϊ��" + father.getAge() 
		+ "����ӵ�е���ƷΪ��" + father.getItem().getMaker() + "��" 
		+ father.getItem().getCode() );
		System.out.println("�����ҵ���Ʒ��" + "���ӵ�����Ϊ" + child.getName() 
		+ "�����ӵ�����Ϊ��" + child.getAge()
		+ "����ӵ�е���ƷΪ��" + child.getItem().getMaker() + "��" 
		+ child.getItem().getCode() );
		System.out.println("����Ʒ�ҵ��ˣ�" + "��Ʒ�ĳ���Ϊ" + I1.getMaker() 
		+ "����Ʒ���ͺ�Ϊ��" + I1.getCode() + "��Ʒ���ڵĶ�����ϢΪ��" + I1.getFather().getName() 
		+ ",����Ϊ��" + I1.getFather().getAge());
		System.out.println("����Ʒ�ҵ��ˣ�" + "��Ʒ�ĳ���Ϊ" + I2.getMaker() 
		+ "����Ʒ���ͺ�Ϊ��" + I2.getCode()
		+ "��Ʒ���ڵĶ�����ϢΪ��" + I2.getChild().getName() 
		+ ",����Ϊ��" + I2.getChild().getAge() );
	}
}
*/