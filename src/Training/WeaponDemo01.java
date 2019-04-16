package Training;
/**
 * 明日晨讲用代码：
 * 主要内容是面向对象继承的简单范例。
 * @author Kamui
 *
 */

abstract class Weapon { // 武器类←父类
	public String name; // 名称
	public int damege; // 攻击力
	public int range; // 攻击范围
	public int speed; // 攻击速度

	public Weapon(String name, int damege, int range, int speed) {// 武器构成
		this.name = name;
		this.damege = damege;
		this.range = range;
		this.speed = speed;
	}

	public int dps(String name) { // 综合输出数值
		int dps = (damege * range * speed) / 60;
		return dps;
	}

	public abstract String level(int dps);// 武器品质

	@Override
	public String toString() {
		return "Weapon [name=" + name + ", damege=" + damege + ", range=" + range + ", speed=" + speed + "]";
	}

}

class Gun extends Weapon {
	public Gun(String name, int damege, int range, int speed) {
		super(name, damege, range, speed);
	}

	@Override
	public String level(int dps) {
		if (dps > 5000 && dps < 10000) {
			return "一般武器";
		}
		if (dps > 10000) {
			return "神级武器";
		}
		return "这是个啥？";
	}

}

class Sword extends Weapon {
	public Sword(String name, int damege, int range, int speed) {
		super(name, damege, range, speed);
	}

	@Override
	public String level(int dps) {
		if (dps > 100 && dps < 500) {
			return "破刀";
		}
		if (dps > 500) {
			return "快刀";
		}
		return "这是个啥？";
	}
}

public class WeaponDemo01 {
	public static void main(String[] args) {
		Weapon pistol = new Gun("USP", 35, 80, 120);//(名称，攻击力，范围，速度)
		Weapon rifle = new Gun("AK47", 60, 200, 600);
		Weapon katana = new Sword("阎魔刀", 120, 10, 40);
		Weapon knife = new Sword("菜刀", 40, 5, 60);
		System.out.println(
				pistol.toString() + "  武器DPS：" + pistol.dps("USP") + "  武器品质：" + pistol.level(pistol.dps("USP")));
		System.out.println(
				rifle.toString() + "  武器DPS：" + rifle.dps("USP") + "  武器品质：" + rifle.level(rifle.dps("USP")));
		System.out.println(
				katana.toString() + "  武器DPS：" + katana.dps("USP") + "  武器品质：" + katana.level(katana.dps("USP")));
		System.out.println(
				knife.toString() + "  武器DPS：" + knife.dps("USP") + "  武器品质：" + knife.level(knife.dps("USP")));
	}
}
