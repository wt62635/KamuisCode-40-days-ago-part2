package day05;
//���������������
public class MethodDemo01 {
	public static void main(String args[]) {
		printInfo();			//����printInfo����
		printInfo();			//����printInfo����
		printInfo();			//����printInfo����
		System.out.println("HelloWorld!!");
	}
	public static void printInfo() {	//����printInfo����
		char c[] = {'H','e','l','l','o',',','H','J','B'};
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println("");
	}
}
