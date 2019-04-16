package day03;

public class Demo09 {
	public static void main(String args[]) {
		/*
		 假设你养了一对小兔子，经过一个月后，
		 小兔子长成大兔子，再经过一个月，
		 产下一对小兔子，此后每个月都会产下一对小兔子
		 产下的小兔子会长大，然后在产下小兔子。
		 问：2年后你有多少对兔子
		 */
		int r1 = 1 ;				//代表上个月兔子数量
		int r2 = 1 ;				//代表上上个月的兔子数量
		int sum = 0 ;				//总数
		for(int i = 3 ; i <=24 ; i++) {
			sum=r1+r2;				//当前月=上月+上上月
			r2=r1  ;				//上月变成上上月
			r1=sum ;				//当前月变成上月
			System.out.println("第" + i + "月的兔子数量为" + sum + "对");	
		}
	}
}