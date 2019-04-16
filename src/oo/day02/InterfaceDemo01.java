package oo.day02;

interface USB{		//接口
	void printInfo();
	
	void printStatus();

}

abstract class Disk {	//抽象类
	abstract void writeData(); 
	abstract void readData();
}


class Memory extends Disk implements USB{	//Memory从接口USB继承Disk
	@Override
	public void printInfo() {
		System.out.println("这里是USB接口");	
	}
	@Override
	public void printStatus() {
		System.out.println("已接入USB接口");
	}
	@Override
	public void writeData() {
		System.out.println("正在写入数据");
	}
	@Override
	public void readData() {
		System.out.println("正在读取数据");
	}
	public void printAll() {		//输出全部方法
		printInfo();
		printStatus();
		writeData();
		readData();
	}
}

public class InterfaceDemo01 {
	public static void main(String[] args) {	//主方法
		Memory drive01 = new Memory() ;
		drive01.printAll();
	}
}
