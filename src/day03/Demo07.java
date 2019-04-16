package day03;

public class Demo07 {
	public static void main(String args[]) {
		//制定一个年份，判断是平年还是闰年
		//闰年判断，满足任意一个即闰年：
		// 1.是4的倍数，但是不能是100的倍数
		// 2.是400的倍数
		int y = 1900 ; 			//定义变量y为年份
		int m = 2 ;				//定义变量m为月份
		int d ;					//定义变量d为天数
		//根据年份y月份m 输出该月有多少天
		if(m == 1||m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 ) {
			d = 31 ;
		}
		else if(m == 2 || m == 4 || m == 6 || m == 9 || m == 11) {
			d = 30 ;
		}
		if((y%4==0&&y%100!=0)||(y%400==0)) {
			d = 29 ;
			System.out.println(y + "是闰年");	
		}
		else {
			d = 28 ;
			System.out.println(y + "不是闰年");
		}
		System.out.println( m + "月有" + d + "天");
	}
}
