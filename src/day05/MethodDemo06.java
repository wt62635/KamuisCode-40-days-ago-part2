package day05;
//方法的递归调用
public class MethodDemo06 {
	//通过递归，完成一个数字的累加操作
	public static void main(String args[]) {
		System.out.println("1累加至100等于：" + sum(100));
	}
	public static int sum(int num) {
		if( num == 1 ){
		return 1 ;
		}
		else{
		return num  + sum(num-1);	//递归调用
		}
	}
}
