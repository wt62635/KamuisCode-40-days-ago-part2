package Training;

public class MaxNumberDemo01 {
	public static void main(String[] args) {
		int a[] = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int tmp ;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < i; j++) {
				if(a[i]>a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp ;
				}
			}
			System.out.println(a[i]);
		}
	}
}
