package javaday04;
//链表的应用
class Link{
	class Node{	
		private String data ;
		private String next ;
		public Node(String data) {
			this.data = data  ;
		}
		public void add(Node  newNode) {
			if(this.next == null) {
				this.next = newNode ;
			}else {
				this.next.add(newNode);
			}
		}
		public void print() {
			System.out.println(this.date + "\t");
			if(this.next!=null) {
				this.next.print() ;
			}
		}
	}
	private Node root ;//根节点
	public void addNode(String data) {
		Node newNode = new Node(data) ;
		if(this.root == null) {
			this.root = newNode ;
		}else {
			this.root.add(newNode) ;
		}
		public void printNode(){
			if(this.root!=null) {
				this.root.print() ;
			}
		}
	}
}

public class NodeDemo03 {
	public static void main(String[] args) {
		Link l =new Link();
		l.addNode("a");
		l.addNode("b");
		l.addNode("c");
		l.addNode("d");
		l.addNode("e");
		System.out.println("增加之后的内容");
	}
}
