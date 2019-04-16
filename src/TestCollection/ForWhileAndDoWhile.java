package TestCollection;
//分别用for,while,do..while求出100-200的累加和
public class ForWhileAndDoWhile {
	public static void main(String[] args) {
		//for循环
		int sum = 0 ;
		for (int i = 100; i <= 200; i++) {
			sum += i;
		}
		System.out.println(sum);
		//while循环
		sum = 0 ;
		int i = 100;
		while(i<=200) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		//do...while循环
		sum = 0 ;
		i = 100 ;
		do {
			sum += i;
			i++ ;
		}while(i<=200);
		System.out.println(sum);
	}
}
