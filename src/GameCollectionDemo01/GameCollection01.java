package GameCollectionDemo01;

import java.util.Scanner;

//面向对象理解练习

/*需求：有3种游戏类型，游戏类型分为ACT、RTS、RPG。
 *现有以下游戏：鬼泣（ACT），命令与征服（RTS），龙与地下城（RPG），勇者斗恶龙（RPG），红色警戒（RTS）
 *，怪物猎人（RPG·ATC），噬神者（ACT·RPG），神界（RPG·RTS），如龙（RPG·ACT），帝国时代（RTS）。
 *一个游戏可能同时属于2种游戏类型。
 *这些游戏又分别由4个不同用户所拥有一部分 ，每个用户分别拥有自己的用户名及密码:
 *Kamui:鬼泣，怪物猎人。		ID:Kamui  PW:001	Genders：male  Age:25
 *Subaru:命令与征服，红色警戒，帝国时代，龙与地下城。	ID:Subaru  PW:002	Genders：male  Age:18
 *Luna:神界，如龙，勇者斗恶龙，龙与地下城。		ID:Luna  PW:003		Genders：female  Age:17
 *Nerd:鬼泣，命令与征服，龙与地下城，勇者斗恶龙，红色警戒，怪物猎人，噬神者，神界，如龙，帝国时代。  
 *ID:Nerd  PW:999	Genders：unknow  Age:0
 *现要求在输入查找游戏类型、游戏名称、用户，这3个条件中的任意一项时可以输出另外两项的信息。
 *当通过用户名进行查询时，必须输入密码。并在成功后输出用户所有信息。
 *在用户名，游戏类型，游戏名输入有误时提供相关信息反馈用户。
 *程序运行时需提供用户选择：1.通过游戏名查找，2.通过游戏类型查找，3.登录用户ID-输出用户所拥有的游戏。
*/

/** 程序分析：
 * 属性关系：类型-游戏 相关，游戏-用户相关，类型-用户相关。
 */


class Database{//数据库
	Database(){
		
		//游戏名称
		GameName DMC = new GameName("鬼泣");
		GameName CAC = new GameName("命令与征服");
		GameName DAD = new GameName("龙与地下城");
		GameName DQ = new GameName("勇者斗恶龙");
		GameName RA = new GameName("红色警戒");
		GameName MH = new GameName("怪物猎人");
		GameName GE = new GameName("噬神者");
		GameName DV = new GameName("神界");
		GameName RG = new GameName("如龙");
		GameName AGE = new GameName("帝国时代");
		//游戏类型
		GameType ACT = new GameType("ACT");
		GameType RTS = new GameType("RTS");
		GameType RPG = new GameType("RPG");
		//玩家账号
		Player p1 = new Player("Kamui",001,"male",25);
		Player p2 = new Player("Subaru",002,"male",18);
		Player p3 = new Player("Luna",003,"female",17);
		Player p4 = new Player("Nerd",999,"unknow",0);
		//关联数据
		GameName name[] = new GameName[] {DMC,CAC,DAD,DQ,RA,MH,GE,DV,RG,AGE};
		GameType type[] = new GameType[] {ACT,RTS,RPG};
		Player player[] = new Player[] {p1,p2,p3,p4};
	}
}

abstract class SearchPro{
	public abstract void searchAndPrintInfo();
}

class Game extends SearchPro{
	private String name;
	private String type[];
	public Game() {
		
	}
	public Game(String name,String type[]) {
		this.name = name ;
		this.type = type ;
	}
	
	@Override
	public void searchAndPrintInfo() {
		// TODO Auto-generated method stub
		
	}
	
}
/*
class GameName extends SearchPro{//游戏名称
	private String name;
	public GameName() {//构造方法1
		
	}
	public GameName(String name) {//构造方法2
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void searchAndPrintInfo() {
			System.out.println("已选择通过游戏名称查找！请输入游戏名：");
			
	}	
}

class GameType extends SearchPro{//游戏类型
	private String type;
	public GameType() {//构造方法1
		
	}
	public GameType(String type) {//构造方法2
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public void searchAndPrintInfo() {
			System.out.println("已选择通过游戏类型查找！请输入游戏类型：");
	}
}*/

class Player extends SearchPro{//玩家
	private String id ;
	private int password ;
	private String genders ;
	private int age ;
	public Player() {//构造方法1
		
	}
	public Player(String id,int password,String genders,int age) {//构造方法2
		this.id = id ;
		this.password = password;
		this.genders = genders;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getGenders() {
		return genders;
	}
	public void setGenders(String genders) {
		this.genders = genders;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void searchAndPrintInfo() {
			System.out.println("已选择通过登录玩家账号查找！请输入账户名：");
	}
}	

public class GameCollection01 {
	public static void main(String[] args) {
		System.out.println("程序启动，正在初始化……");
		new Database();//实例化所有对象
		System.out.println("初始化完成！");
		System.out.println("------------------------------------------");
		System.out.println("已进入游戏信息库查询程序！请选择查询方法：（请输入整数1/2/3）");
		System.out.println("1.通过游戏名查询");
		System.out.println("2.通过游戏类型查询");
		System.out.println("3.通过登录玩家账号查询");
		System.out.println("请选择查询方法：（请输入整数1/2/3）");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch(select) {
		case 1:
			new Game().searchAndPrintInfo();;
			break;
		case 2:
			new Game().searchAndPrintInfo();
			break;
		case 3:
			new Player().searchAndPrintInfo();
			break;
		default:
			System.out.println("错误输入，程序结束。");
			break;
		}
		sc.close();
		System.exit(1);//结束程序
	}
}
