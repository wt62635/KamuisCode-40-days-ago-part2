package javaday06;
/*
 * 【练习题】02.类的成员变量 请定义一个交通工具(Vehicle)的类其中有:
 *  属性速度(speed)体积(size)等等 
 *  方法移动(move())设置速度(setSpeed(int speed))
 *  加速speedUp(),减速speedDown()等等. 
 *  最后在测试类Vehicle中的main()中
 *  实例化一个交通工具对象
 *  并通过方法给它初始化speed,size的值并且通过打印出来。
 *  另外调用加速减速的方法对速度进行改变。
 */
public class VehicleDemo01 {
		private String name ;
		private int speed ;
		private int size ;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getSpeed() {
			return speed;
		}
		public void move() {
			this.speed = 0 ;
		}
		public void setSpeed(int speed) {
			this.speed = speed ;
		}
		public void speedUp() {
			this.speed = speed + 10 ;
		}
		public void speedDown() {
			this.speed = speed - 10 ;
		}
	public static void main(String[] args) {
		VehicleDemo01 h1 = new VehicleDemo01();
		h1.setName("h2s");
		h1.setSpeed(120);
		h1.setSize(8);
		System.out.println(h1.getName()+"\t"+h1.getSpeed()+"\t"+h1.getSize()+"\t");
		h1.move();
		System.out.println(h1.getSpeed());
		h1.speedDown();
		System.out.println(h1.getSpeed());
		h1.speedUp();
		h1.speedUp();
		h1.speedUp();
		System.out.println(h1.getSpeed());
		System.out.println(h1.speed);
	}
}
