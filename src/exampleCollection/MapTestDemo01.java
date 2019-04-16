package exampleCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTestDemo01 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("键1", "值1");
		map.put("键2", );
		System.out.println(map.size());
		
		Set set = map.keySet();
		Iterator it =  set.iterator();
		
		System.out.println(map.get("键1"));
	}
}
