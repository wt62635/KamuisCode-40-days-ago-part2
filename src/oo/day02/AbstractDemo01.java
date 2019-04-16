package oo.day02;

abstract class Program{
	private String name ;
	private String maker ;
	private int code ;
	public Program(String name , String maker , int code) {
		this.name = name ;
		this.maker = maker ;
		this.code = code ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	abstract String getInfo();
}

class Game extends Program{
	private int player ;
	public Game(String name,String maker,int code,int player) {
		super(name, maker, code);
		this.player = player;
		
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	
	public int getPlayer() {
		return this.player ;
	}

	@Override
	public String getInfo() {
		return "名称：" + this.getName() + ",厂家" + this.getMaker() 
				+ ",编号" + this.getCode() + ",玩家人数" + this.getPlayer();		
	}
	
}

private class Kamui{
	
}

public class AbstractDemo01 {
	public static void main(String[] args) {
		Game g1 = new Game("K","Sony",001,1);
		System.out.println(g1.getInfo());
	}
}
