package day05;
//һλ���飬���������
public class NumGroup03 {
	public static void main(String args[]) {
		int num[] = {55,88,66,99,77,88,44,22};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(num[i]<num[j]) {//������ѭ�������i��jС��ִ������ѭ��
					//�磺55<88����55����temp����j��88����i���ٽ�temp��55����j������ִ��ѭ����
					int temp = num[i] ; //�����м����,��iȡ��ֵ����temp����
					num[i] = num[j] ;	//��jȡ�õ�ֵ����i��
					num[j] =  temp ;	//��temp��ֵ����j��
				}
			}//ͨ��˫ѭ�������ڱ�������Ԫ�ص�ͬʱ�޸�ÿ�����ڴ��е�Ԫ�أ�����������Ч����
		}
		for (int i = 0; i < num.length; i++) {	//��������ѭ�������
			System.out.print(num[i] + "\t");	
		}
	}
}
