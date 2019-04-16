package day08;
//什么是匿名对象
	class Man {
		private String Name ;
		private int age ;
		public Man(String n , int a ){	//构造方法
			if("Kamui".equals(n)) {
				System.out.println("姓名错误，不予赋值。");
				return;
			}
			if(a<0||a>150) {
				System.out.println("年龄错误，不予赋值");
				return;
			}
			this.Name =  n ;
			this.age =  a ;
				System.out.println(this.Name +this.age);
		}
		public void setName(String n) {
				Name = n ;
		}
		public void setAge(int a) {
				age = a ;	
		}
		public String getName() {
			return Name ;
		}
		public int getAge() {
			return age ;
		}
		public void tell() {
			System.out.println(this.Name+this.age);
		}
	}
	public class Demo02 {
	public static void main(String[] args) {
		Man M1 = new Man("Kamui",25);
		M1.tell();
	}
}
		