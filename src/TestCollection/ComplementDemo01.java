package TestCollection;

public class ComplementDemo01 {
	public static void main(String[] args) {
		int n = 0xcd00;
		int m = 0xdf;
		int k = n|m;
		
		int b1 = 0xdd;
		int b2 = 0x6e;
		int b3 = 0xbb;
		int b4 = 0xad;
		//拼接b1,b2,b3,b4
		int x = (b1<<24)|(b2<<16)|(b3<<8)|b4;
		System.out.println("n的二进制结果：" + Integer.toBinaryString(n));
		System.out.println("m的二进制结果：" + Integer.toBinaryString(m));
		System.out.println("k的二进制结果：" + Integer.toBinaryString(k));
		System.out.println("b1的二进制结果：" + Integer.toBinaryString(b1));
		System.out.println("b2的二进制结果：" + Integer.toBinaryString(b2));
		System.out.println("b3的二进制结果：" + Integer.toBinaryString(b3));
		System.out.println("b4的二进制结果：" + Integer.toBinaryString(b4));
		System.out.println("x的二进制结果：" + Integer.toBinaryString(x));
		}
	}
