package day05;
//��ϰ��return��������
public class MethodDemo05 {
	public static void main(String args[]) {
		System.out.println("ǰ");
		fun(10);
		System.out.println("��");
	}
	public static void fun(int x){
		System.out.println("��");
		if(x==10) {
			return ;//��������
		}
		System.out.println("return");//����������Ͳ������
	}
}
