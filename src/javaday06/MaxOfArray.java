package javaday06;

import java.util.Arrays;

public class MaxOfArray {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int) (Math.random()*100);
		}
		int max = arr[0] ;
		for(int j = 0 ; j < arr.length ; j++) {//
			//System.out.println(arr[j]);
			if( arr[j] > max) {
				max = arr[j];
				//System.out.println("���ֵΪ��" + max);
			}
		}
		arr = Arrays.copyOf(arr, arr.length + 1);//��������+1
		arr[arr.length-1] = max ;			//�����ֵ�������һ��Ԫ��
		for (int i = 0; i < arr.length; i++) {
			System.out.println("��" + (i+1) + "�������" + arr[i]);
		}
	}
}
