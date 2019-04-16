package Training;

import java.util.Random;

public class BubbleSortDemo01 {
	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			Random r = new Random();
			a[i] = r.nextInt(100);
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp ;
				}
			}
			
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + "\t");
		}
	}
}
