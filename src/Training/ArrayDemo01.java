package Training;
//冒泡排序法
public class ArrayDemo01 {
		public static void main(String[] args) {
			int a[] = new int[] {15,67,26,43,61,25,84,80,34,70};
			int tmp = 0 ;
			for (int i = 0; i < a.length-1; i++) {//控制循环轮数
				for (int j = 0; j < a.length-1-i; j++) {//控制循环次数
					if(a[j]>a[j+1]) {
						tmp = a[j] ;
						a[j] = a[j+1] ;
						a[j+1] = tmp ;
					}
			//		System.out.print(a[j] + "\t");
				}
			}
			System.out.println();
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + "\t");
			}
	}
}


