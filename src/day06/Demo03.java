package day06;
//自我练习：写出一个包含面向对象基本概念的引用数据类型练习代码。
class Vehicle{
	String Maker ;
	String CodeName ;
	int maxSpeed ;
	double heavyWeight ;
	public void checkStatus() {
		System.out.println("Maker:"+Maker);
		System.out.println("CodeName:"+CodeName);
		System.out.println("maxSpeed:"+ maxSpeed +"km/h");
		System.out.println("HeavyWeight:" + heavyWeight + "ton");
		System.out.println("What the wonderful Car!!!Hell Yeah!!");
	}
}
public class Demo03 {
	public static void main(String args[]) {
		Vehicle Haval =  null;
		Haval = new Vehicle();
		Haval.Maker = "Haval" ;
		Haval.CodeName = "H2s";
		Haval.maxSpeed = 150 ;
		Haval.heavyWeight = 1.45 ;
		System.out.println("Do you like this car?Let's check it status!");
		Haval.checkStatus();
	}
}
