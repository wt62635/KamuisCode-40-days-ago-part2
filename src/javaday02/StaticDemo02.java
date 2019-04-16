package javaday02;
//staticʹ�÷�������
class Demo{
	private String name ;
	private static int count = 0 ;	//���ж����������
	public Demo() {
		count++ ;						//ÿ������ʵ����һ�Σ������
		this.name = "�Զ�����-" + count ;	//�Զ���������
	}
	public Demo(String name) {
		this.name = name ;
	}
	public String getName() {
		return name;
	}
}
public class StaticDemo02 {
	public static void main(String[] args) {
		System.out.println(new Demo().getName());			//ʹ���޲ι��췽��
		System.out.println(new Demo("Kamui").getName());	//ʹ���вι��췽��
		System.out.println(new Demo().getName());
		System.out.println(new Demo("Subaru").getName());
	}
}
