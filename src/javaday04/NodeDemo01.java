package javaday04;
//��������-����
class Node{
	private String data;	//��װ���ԣ�����ڵ�����
	private Node next;		//��ʾ��һ���ڵ������
	public Node(String data) {	//ͨ�����췽�����ýڵ�����
		this.data = data ;	//��������
	}
	public String getData() {
		return this.data;
	}
	public Node getNext() {
		return this.next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
public class NodeDemo01 {
	public static void main(String[] args) {
		Node root = new Node("���ڵ�") ; //ʵ�������󣬲���ֵΪ�����ڵ㡱�����ǵ�1���ڵ㣩
		Node n1 = new Node("�ڵ�A");		//��1���ڵ�
		Node n2 = new Node("�ڵ�B");		//��2���ڵ�
		Node n3 = new Node("�ڵ�C");		//��3���ڵ�
		Node n4 = new Node("�ڵ�D");		//��4���ڵ�
		root.setNext(n1);				//���ø��ڵ����һ���ǵ�1�����ڵ�
		n1.setNext(n2);					//���õ�1���ڵ����һ���ǵ�2�����ڵ�
		n2.setNext(n3);					//���õ�2���ڵ����һ���ǵ�3�����ڵ�
		n3.setNext(n4);					//���õ�3���ڵ����һ���ǵ�4�����ڵ�
		printNode(root) ;				//��ͷ��ʼ���
	}
	public static void printNode(Node node) {	//����ڵ��������
		System.out.println(node.getData() + "\t") ;//������ڵ������
		if(node.getNext()!=null) {				//�ж���һ���ڵ������Ϊnull
			printNode(node.getNext());			//����������һ���ڵ㡣
		}
	}
}
