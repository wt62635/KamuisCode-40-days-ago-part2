package javaday07;
import java.util.Arrays;
//ArraySort01�������򷽷�
public class ArraySort01 {
	public static void main(String[] args) {
		int arr[] = new int[10000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100000000);//�����ֵ *��Χ
		}
		
		long a = System.currentTimeMillis();
		Arrays.sort(arr);	//��������
		long b = System.currentTimeMillis();
		/*for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}*/
		System.out.println("��������ʱ�� = " + (b-a) + "����");
	}
}
