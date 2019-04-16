package day01;
//如何创建和调用方法。
public class Knight {
	public static void main(String args[]) {
		int weapon = 5 ;
		int armor = 10 ;
		Knight equipment = new Knight();
		System.out.println("Knight拥有"+weapon+"件武器，和"+armor
						+"件铠甲。装备合计共有"+
						equipment.test(weapon , armor)+"件。"); 
		//可直接通过（变量名称.方法名）直接调用静态方法。
	}

	private int add(int weapon ,int armor) {
		int equipment = weapon + armor ;
		return  equipment ;
	}
	
	private int test(int weapon ,int armor) {
		int equipment = weapon * armor ; 
		return equipment ;
	}
	}
