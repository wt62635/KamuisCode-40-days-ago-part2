package oo.day03;
//引用数据类型数组
public class RefArrayDemo {
	public static void main(String[] args) {
		Student[] stus= new Student[3];
		stus[0] = new Student("Kamui",25,"T1");
		stus[1] = new Student("Subaru",22,"T2");
		stus[2] = new Student("Luna",27,"T3");
		System.out.println(stus[0].name);
		stus[1].age = 23 ;
		stus[2].print();
		
		Student[] ss = new Student[] {
				new Student("Kamui",25,"T1"),
				new Student("Subaru",22,"T2"),
				new Student("Luna",27,"T3")};
		for (int i = 0; i < ss.length; i++) {
			Student s = stus[i];
			System.out.println(s.name);
			s.print();
		}
	}
}
