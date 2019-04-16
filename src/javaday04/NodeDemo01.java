package javaday04;
//单向链表-举例
class Node{
	private String data;	//封装属性，保存节点内容
	private Node next;		//表示下一个节点的内容
	public Node(String data) {	//通过构造方法设置节点内容
		this.data = data ;	//设置内容
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
		Node root = new Node("根节点") ; //实例化对象，并赋值为“根节点”（不是第1个节点）
		Node n1 = new Node("节点A");		//第1个节点
		Node n2 = new Node("节点B");		//第2个节点
		Node n3 = new Node("节点C");		//第3个节点
		Node n4 = new Node("节点D");		//第4个节点
		root.setNext(n1);				//设置根节点的下一个是第1个各节点
		n1.setNext(n2);					//设置第1个节点的下一个是第2个各节点
		n2.setNext(n3);					//设置第2个节点的下一个是第3个各节点
		n3.setNext(n4);					//设置第3个节点的下一个是第4个各节点
		printNode(root) ;				//从头开始输出
	}
	public static void printNode(Node node) {	//定义节点输出方法
		System.out.println(node.getData() + "\t") ;//输出根节点的内容
		if(node.getNext()!=null) {				//判断下一个节点如果不为null
			printNode(node.getNext());			//则继续输出下一个节点。
		}
	}
}
