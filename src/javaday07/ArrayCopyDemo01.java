package javaday07;
//arrycopyʹ�÷�����
public class ArrayCopyDemo01 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[] = new int[6] ; 
		System.arraycopy(a, 2, b, 1, 3);
		/*a:Դ����
		 * 1��Դ�������ʼ�±�
		 * b:Ŀ������
		 * 0:Ŀ���������ʼ�±�
		 * 4:Ҫ���Ƶ�Ԫ�ظ���
		 */
		for (int i = 0; i < b.length; i++) {
			System.out.print("\t" + b[i]);
		}
	}
}
