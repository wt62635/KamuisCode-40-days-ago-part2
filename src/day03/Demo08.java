package day03;

public class Demo08 {
	public static void main(String args[]) {
	//forѭ������ʽ��
	//��ʼ�����ʽ�����������;�������ʽ��ѭ��������;ѭ����Ĳ������ʽ���޸ı�����
		/*forѭ������ʾ
		 * �ҳ�100����3�ı���
		* ���1�ۼӵ�100�ĺ�ֵ*/
	//	for (int i = 0; i < 100; i = i + 3) {
	//		System.out.println(i);
	//	}
		for(int j = 1; j <= 100 ; j++) {
			int sum = 0 ;
				sum += j ;					//+=�ۼ�
				System.out.println(sum);
		}
	}
}
