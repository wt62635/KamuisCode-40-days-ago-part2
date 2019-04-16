package day05;

public class Test01 {
	public static void main(String args[]) {
		int[] arr = new int[] {8,2,1,0,3};
		int[] index = new int [] {2,0,3,2,4,0,1,3,2,3,3};
		String tel = "" ;
		for (int i : index) {	//foreach循环，遍历数组中的每个元素。即将index的值赋予i。
			tel += arr[i];
		}
		System.out.println("联系方式" + tel);
	}
}
