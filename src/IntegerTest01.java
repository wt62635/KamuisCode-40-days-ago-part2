//包装类使用方法-Integer为例
public class IntegerTest01 {
	public static void main(String[] args) {
		System.out.println("int类型最大值：" + Integer.MAX_VALUE);
		System.out.println("int类型最小值：" + Integer.MIN_VALUE);
		System.out.println("int类型长度值：" + Integer.SIZE);
		System.out.println("int类型的类型：" + Integer.TYPE);
		
		System.out.println("---------------------------------");
		
		//通过构造方法创建Integer对象
		Integer inte1 = new Integer(123);	//数值	
		System.out.println(inte1);
		Integer inte2 = new Integer("123456");//字符串
		System.out.println(inte2);
		Integer inte3 = Integer.valueOf("321321");
		//字符串转换为Integer
		System.out.println(inte3);
		
		System.out.println("---------------------------------");
		
		int num1 = Integer.parseInt("8795");
		System.out.println(num1+2);//转换成字符串也可以计算
		int num2 = inte2.intValue();//可以获取int型返回值
		System.out.println(num2-10);//也可以运算
		//转成二进制toBinaryString
		String str1 = Integer.toBinaryString(1234);
		System.out.println("11的二进制数为：" + str1);
		//转成十六进制toHexString
		String str2 = Integer.toHexString(1234);
		System.out.println("11的十六进制数为：" + str2);
		//转成八进制toOctalString
		String str3 = Integer.toOctalString(1234);
		System.out.println("11的八进制数为：" + str3);
		//转成自定义进制toString(数值,指定进制)
		String str4 = Integer.toString(1234,15);
		System.out.println("11转换为15进制数为：" + str4);
		
		//其他转换同理
		Byte b = new Byte("123");
		Short s = new Short("123");
		Long l = new Long(123L);	
	}
}
