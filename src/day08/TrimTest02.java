package day08;

public class TrimTest02 {		
	public static boolean isEmpty( String S1 ) {	//声明一个isEmpty判断方法判断字符串变量S1
        if ( null == S1 || "".equals(S1)) {			//如果S1的值等于null(空)或堆内存中的S1的值与"(空)"完全相等
            return true;							//则返回值为true
        } else if ( "".equals(S1.trim()) ) {		//否则或是S1的值通过.trim()方法去除两侧空白后
            return true;							//堆内存的值与"(空)"完全相等，则返回值为true
        }
        return false;								//否则为返回值为false
    }
	public static void main(String[] args) {
		System.out.println(isEmpty("   "));			//给S1赋值几个空格，输出结果为true。
	}
}