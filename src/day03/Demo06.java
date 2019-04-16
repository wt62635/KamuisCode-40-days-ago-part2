package day03;

public class Demo06 {
	public static void main(String args[]){
		//指定一个月份，判断该月份属于哪个季节
		int m = 1 ;
		if(m == 3|| m == 4|| m == 5) {
			System.out.println("春");
		}
		else if(m == 6|| m == 7|| m == 8) {
			System.out.println("夏");
		}
		else if(m == 9|| m == 10|| m == 11) {
			System.out.println("秋");
		}
		else{
			System.out.println("冬");
		}
	}
}
