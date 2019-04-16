package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(0,"鬼泣");
		list.add(1,"命令与征服");
		list.add(2,"龙与地下城");
		list.add(3,"勇者斗恶龙");
		list.add(4,"红色警戒");
		list.add(5,"怪物猎人");
		list.add(6,"噬神者");
		list.add(7,"神界");
		list.add(8,"如龙");
		list.add(9,"帝国时代");
		for (int i = 0; i < list.size()-1; i++) {
			System.out.println(list.get(i));
		}
	}
}
