package TestCollection;
//多态特性测试代码
interface A {			//接口A
	void printInfo();
}

interface B {			//接口B
	void printJob();
}

abstract class Family implements  A,B{//抽象类Family继承接口A,B
	abstract void printSkill() ;
	String COUNTRY = "China";
}

class Male extends Family {	//子类Male继承父类Family
	String skill = "编程";
	String job = "程序员";
	String name = "K" ;
	int age = 27 ;
	@Override
	public void printInfo() {
		System.out.println("父亲的姓名：" + name + ",父亲的年龄：" + age + "父亲的国籍：" + COUNTRY);
	}

	@Override
	public void printJob() {
		System.out.println("父亲的工作：" + job);
	}

	@Override
	void printSkill() {
		System.out.println("父亲的技能：" + skill);
	}
	
}

class Female extends Family{	//子类Female继承父类Family
	String skill = "烹饪";
	String job = "主妇";
	String name = "S" ;
	int age = 25 ;
	@Override
	public void printInfo() {
		System.out.println("母亲的姓名：" + name + ",母亲的年龄：" + age + "母亲的国籍：" + COUNTRY);
	}

	@Override
	public void printJob() {
		System.out.println("母亲的工作：" + job);
	}

	@Override
	void printSkill() {
		System.out.println("母亲的技能：" + skill);
	}	
}

class Child extends Male{	//子类Child继承父类Male
	String hobby = "游戏";
	String name = "X" ;
	int age = 6 ;
	String job = "学生" ;
	String skill = "学习" ;
	@Override
	public void printInfo() {
		System.out.println("孩子的姓名：" + name + ",孩子的年龄：" + age + "孩子的国籍：" + COUNTRY);
	}
	
	public void printSkill() {
		System.out.println("孩子的技能：" + skill);
	}
	public void printHobby() {
		System.out.println("爱好：" + hobby);
	}
}

public class Test01 {
	public static void main(String[] args) {
		print(new Child());
//		print(new Female());
	}
		public static void print(Male father){
			father.printInfo();
			if(father instanceof Male) {
				Child son = (Child)father;
				son.printHobby();	
			}
		}
		
	}
