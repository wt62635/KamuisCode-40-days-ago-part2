package day06;
//������ϰ��д��һ�����������������������������������ϰ���롣
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
