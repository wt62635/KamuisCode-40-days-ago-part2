package day05;
//二维数组的静态初始化
public class NumGroup05 {
	public static void main(String args[]) {
		int num[][] = {{88,55,66},{99,11,22,33,55},{66,44,22,33},{66,88,44,11,55,99}};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");	
			}
			System.out.println("");
		}
		
	}
}
