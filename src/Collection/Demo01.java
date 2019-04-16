package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//类集实际上就是一个动态的对象数组，与一般对象数组不同，类集中的对象内容可以任意扩充。
/**
 * List接口的功能
 * ArryList是最常用的子类
 * 
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();//指定操作的泛型为String
		Collection<String> collection = new ArrayList<String>();//制定一个集合
		list.add("Hello");//此方法由Collection接口而来
		list.add("World");//默认情况下往后添加
		list.add(0,"Say:");//在第一个位置上添加新的内容
		System.out.println(list);
		collection.add("Kamui");
		collection.add("Subaru");
		list.addAll(2,collection);//可以指定位置添加
		System.out.println(list);
		
		
	}
}
