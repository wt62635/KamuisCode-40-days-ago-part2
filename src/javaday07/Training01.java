package javaday07;

import java.util.Arrays;

//������Ԫ�����ֵ���������һ��Ԫ�ص�λ��
public class Training01 {
	public static void main(String[] args) {
		int arr[] = new int[] {11,22,55,44,88,11,33,22};
		Arrays.sort(arr);//������������
		int max = arr[arr.length-1];
		for (int t = 0; t < arr.length; t++) {	//�����������
				System.out.println(arr[t]);
			}
		System.out.println("���ֵ��" + max);
			}
	}
