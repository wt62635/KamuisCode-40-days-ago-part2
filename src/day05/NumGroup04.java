package day05;
//��ά���鶯̬��ʼ����ʽ
public class NumGroup04 {
	public static void main(String args[]) {
		int num[][] = new int [4][5]; //������ʵ������ά����
		num[0][0] = 30 ;
		num[1][1] = 20 ;
		num[2][4] = 10 ;
		num[3][2] = 50 ;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+ "\t");
			}
			System.out.println("");
		}
	}
}
