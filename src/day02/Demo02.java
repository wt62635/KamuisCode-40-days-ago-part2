package day02;

public class Demo02 {
	public static void main(String args[]) {
		//��ʾ�߼������&& || ��
		int a = 3 ;						
		int b = 4 ;						//�������ͱ���
		int c = 5 ;								
		System.out.println(a>b&&c>b);	//&&(����)��Ҫ��������������ſ����true��	
		System.out.println(a>b||c>b);	//||���̻�ֻ��Ҫ1���������㼴�����true��
		System.out.println(!(a>b));     //!���ǣ���Ҫ�����������������true��
		//������Ϊfalse,true,true.
	}
}
