package day03;

public class LoopTest {
	public static void main(String args[]) {
		Loop1 :for(int i = 1 ; i<=10 ; i++ ) {
			System.out.println("i=" + i);
			Loop2 :for(int j = 1 ; j<=i ; j++ ) {
					System.out.println("j = " + j);
					if(j == 5) {
						break Loop1;
				}
			}
		}
	}
}
