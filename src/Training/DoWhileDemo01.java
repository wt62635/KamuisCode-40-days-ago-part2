package Training;
//打印100~200之间能被3整除的数
public class DoWhileDemo01 {
	public static void main(String[] args) {
		int x = 100;
		do {
			if(x%3==0) {
				System.out.println(x);
			}
				x++;
		}while(x<=200);
	}
}
