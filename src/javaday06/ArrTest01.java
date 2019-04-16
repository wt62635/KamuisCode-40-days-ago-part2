package javaday06;

public class ArrTest01 {
	public static void main(String[] args) {
		//①
		int arr1[] = new int[10];
		//②
		int arr2[] = {1,4,7};
		int arr3[] = new int[]{1,4,7};
		//③
		int arr[] = new int[3];
		arr[0] = 100 ;
		arr[2] = 300 ;
	//	arr[3] = 400 ; //下标越界
		System.out.println(arr.length);
		System.out.println(arr[arr.length-1]);
		//④
	}
}
}