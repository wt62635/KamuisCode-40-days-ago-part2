package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo01 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add("Kamui");
		c.add(true);
		c.add(13.45);
		c.add('C');
		
		Iterator it = c.iterator();
		while(it.hasNext()) {//判断集合中是否还有元素可以取出
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
