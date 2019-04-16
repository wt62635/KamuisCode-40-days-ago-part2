package day04;
public class Demo01 {
	public static void main(String args[]) {
		//for循环——嵌套for循环
		for (int i = 1; i < 5; i++) {//外层循环作用域起
			System.out.println("外层循环第" + i + "次循环" );
			for (int j = 1; j < 3; j++) {//内层循环作用域起
				System.out.println("内层循环第" + j + "次循环" );
			}//内层循环作用域止
		}//外层循环作用域止
	}
}
