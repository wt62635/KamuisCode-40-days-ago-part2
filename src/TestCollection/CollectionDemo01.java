package TestCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add(new Object());
		
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
