package javaday07;
import java.util.Arrays;	//�������鸴�ƹ���
//
public class ArrayCopyDemo02 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		/*a:Դ����
		 * b:Ŀ������
		 * 6:Ŀ������ĳ��ȣ�Ԫ�ظ�����
		 */
		int b[] = Arrays.copyOf(a, 8);
		//��������+1
		 a = Arrays.copyOf(a, a.length + 1);
		 
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
