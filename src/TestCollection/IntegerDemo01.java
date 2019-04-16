package TestCollection;

public class IntegerDemo01 {
	public static void main(String[] args) {
		Integer inte1 = Integer.parseInt("456");
		Integer inte2 = Integer.valueOf("456");
		System.out.println(inte2.equals(inte1));
		String str1 = Integer.toBinaryString(inte1);
		String str2 = Integer.toHexString(inte1);
		String str3 = Integer.toOctalString(inte1);
		String str4 = Integer.toString(inte1,15);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
