import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//ArratList各种使用方法（动态数组）
public class ArrayListAndLinkedList01 {
public static void main(String[] args) {
	List list = new LinkedList();
	
	list.add("添加T1");
	list.add("添加T2");
	list.add("添加T3");
	list.add("添加T4");
	list.add("添加T5");
	System.out.println(list.get(4));//输出元素4的值
	list.add(1,"添加插入T00");
	list.set(4, "元素修改为T99");
	
	list.add(null);//可添加空值
	
	System.out.println(list.size());//输出数组长度
	System.out.println(list.remove(1));//删除元素1
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));//输出全部元素
	}
	//被删除元素不会为空，而是将后面的元素往前移，同时数组长度也会减短
}
}
