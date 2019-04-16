package Training;

//父类-武器类
class Weapon{
	public String name ;
	public int damege ;
	public int range ;
	public int speed ;
	//武器的构造方法
	public Weapon(String name, int damege, int range, int speed) {
		this.name = name;
		this.damege = damege;
		this.range = range;
		this.speed = speed;
	}
	//输出算法
	public int dps(String name) {
		int dps = (damege * range * speed)/60 ;
		return dps ;
	}
	public void level(int dps) {
		
	}
	@Override
	public String toString() {
		return "武器 [名称=" + name + ", 伤害=" + damege + ", 范围=" + range + ", 速度=" + speed + "]";
	}
	
}

//子类-枪类
class Gun extends Weapon{
	//枪类的构造方法
	public Gun(String name, int damege, int range, int speed) {
		super(name, damege, range, speed);
	}
	
}

//子类-刃类
class Sword extends Weapon{
	//刃类的构造方法
	public Sword(String name, int damege, int range, int speed) {
		super(name, damege, range, speed);
	}
	
}

public class WeaponDemo02 {

}
