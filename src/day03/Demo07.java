package day03;

public class Demo07 {
	public static void main(String args[]) {
		//�ƶ�һ����ݣ��ж���ƽ�껹������
		//�����жϣ���������һ�������꣺
		// 1.��4�ı��������ǲ�����100�ı���
		// 2.��400�ı���
		int y = 1900 ; 			//�������yΪ���
		int m = 2 ;				//�������mΪ�·�
		int d ;					//�������dΪ����
		//�������y�·�m ��������ж�����
		if(m == 1||m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 ) {
			d = 31 ;
		}
		else if(m == 2 || m == 4 || m == 6 || m == 9 || m == 11) {
			d = 30 ;
		}
		if((y%4==0&&y%100!=0)||(y%400==0)) {
			d = 29 ;
			System.out.println(y + "������");	
		}
		else {
			d = 28 ;
			System.out.println(y + "��������");
		}
		System.out.println( m + "����" + d + "��");
	}
}
