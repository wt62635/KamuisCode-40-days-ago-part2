package day02;

public class Demo04 {
	public static void main(String args[]) {
		//�εδ򳵼Ƽ۳���
		//�����𲽼�10Ԫ��3���,����3����Ĳ���
		//ÿ�������2Ԫ
		//���ݳ����Ĺ����������ʵ����Ҫ֧�����y
		int start = 10 ;	 //�����𲽼�
		int rmb = 0;		//�������ռ�
		int km = 28 ;	 	//���幫����
		int plus = 2 ;		//������ռ�
		if(km>=3) {
			rmb = start + (km*plus) ;
		System.out.println("���ռ�Ϊ" + rmb + "Ԫ");
		}
		else {
			rmb = start ;
		System.out.println("���ռ�Ϊ" + rmb + "Ԫ");	
		}
	}

}
