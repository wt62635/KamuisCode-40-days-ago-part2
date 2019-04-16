package day05;

public class ForeachDemo01 {
	public static void main(String args[]) {
		int arr[] = new int[] {2,9,0,5,1,7,3 };
		int index[] = new int[]{3,0,1,0,3,6,2,4,5};
		String qq = "";
		for (int i : index) {
			qq += arr[i];
		}
		System.out.println("up主联系方式：" + qq);
	}
}
