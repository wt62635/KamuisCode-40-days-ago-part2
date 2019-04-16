package javaday07;

import java.util.Random;
import java.util.Scanner;
//猜字游戏(功能完整测试版1.0)
public class HomeWork02 {
	static int result ;								//定义总分全局变量
	static Scanner sc = new Scanner(System.in);		//定义输入全局方法
	public static void main(String[] args) {		//主方法
		System.out.println("猜字游戏程序已启动！");
		endOrReStart();								//进入开始方法
	}
	
	public static void endOrReStart() {				//开始方法
		System.out.println("----------开始游戏----------");
		System.out.println("游戏说明：游戏等级设为三等：5、7和9，代表所需要猜测的字母个数。" + "\n"
				+ "游戏开始时，由玩家选择游戏等级（5，7，9）。如果选择7，则会随机产生7个不重复的字符，" + "\n"
				+ "然后玩家输入一个字符串包含7个字符，对这7个字符和随机产生的7个字符比较，" + "\n"
				+ "系统判断是否正确，并统计分数。【字符范围为：A~Z】");
		round();
		System.out.println("==========最终得分==========");
		System.out.println(result + "分");		//输出最终结果。
		System.out.println("");
		System.out.println("游戏已结束。请输入任意字符继续游戏，或输入“exit”退出程序。");
		String choice = sc.nextLine();
		if("exit".equals(choice)) {
			System.out.println("程序已结束，感谢使用。");//结束程序选项
		}
		else {
			endOrReStart();
		}
	}

	public static void lengthConfirm(char c1[] , char p1[]) {	//（追加修改）核对俩数组长度方法
		if(c1.length!=p1.length) {						//设置错误输入判定规则
			System.out.println("错误：输入的字符数量有误，将退回到等级选择。");
			select();
			return ;								//因输入值错误，故而直接结束当前方法
		}else {
			point(c1,p1);							//计分输出
		}		
	}
	
	/**
	 *
	 * @param com	接收生成字符数组
	 * @param ply	接收输入字符数组
	 */
	
	public static void point(char com[] , char ply[]) {		//结果与计分输出方法	
		System.out.println("==========对比情况==========");
		System.out.print("生成的字符为：");
		printArr(com);
		System.out.print("\n" + "您的字符为：");
		printArr(ply);
		System.out.println();
		System.out.println("==========得分情况==========");
		int pt[] = judge(com,ply);				//将传入判定方法后返回的值赋给一个整型数组变量  //
		int getPoint = pt[0]*10;			//每出现相同字符元素得10分
		int bonus = pt[1]*50;				//每没出现相同位置的字符元素的50分
		int deduction = pt[2]*10;			//每不相同一个元素扣10分
		System.out.println("相同字符元素得分：" + getPoint + "分");
		System.out.println("相同位置元素加分：" + bonus + "分");
		System.out.println("不相同字符元素扣除分：" + (-deduction) + "分");
		result += getPoint + bonus - deduction;		//累加每次得分结果
	}

	public static void round() {			//设置回合执行次数方法
		System.out.println("==========轮数选择==========");
		System.out.println("请输入相应数字，选择本场游戏轮数：3/5/10，或输入“exit”结束程序。");
		String choice = sc.nextLine();
		if("3".equals(choice)) {
			for(int i = 1 ; i <=3 ; i++) {
				System.out.println("**********第" + i + "轮**********");
				select();
			}
		}else if("5".equals(choice)){
			for(int i = 1 ; i <=5 ; i++) {
				System.out.println("**********第" + i + "轮**********");
				select();
			}
		}else if("10".equals(choice)){
			for(int i = 1 ; i <=10 ; i++) {
				System.out.println("**********第" + i + "轮**********");
				select();
			}
		}else if("exit".equals(choice)){
			System.out.println("程序已结束，感谢使用。");//结束程序选项
			System.exit(1);
		}
		else {
			System.out.println("输入有误，请重新输入。");
			round();
		}
	}

	public static int[] judge(char x [],char y[]) {			//对比数组判定规则方法
		int count []= new int[3] ;					//定义相等与不相等计数
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if(x[i]==y[j]) {
					count[0]++;	
					if(i==j) {
						count[1]++;				//元素1用于计数位置相同
					}
					break ; 					//当x[i]的指向相等一次后即结束本次循环
					}							//元素0用于计数字符相同
					
					//		System.out.println("第" + (i+1) + "个字符的" + x[i] + "相等");
				}
			}
			count[2] = (count[0] - y.length)*(-1);		//元素2用于计算不相同字符
		System.out.println("猜中了" + count[0] + "个字符。||"
				+ "猜中了" + count[1] + "个字符位置。||"
				+ "猜错了" + count[2] + "个字符。");
		return count;
}

	public static char[] input() {				//获取用户输入方法
		String player = sc.nextLine();
		char p1[] = player.toCharArray();		//将字符串转换为字符数组。
//测试用语句	System.out.println("输入的元素为：" );
//测试用语句	printArr(p1);
		return p1 ;
	}

	public static void select() {			//选择等级
		System.out.println("==========等级选择==========");
		System.out.println("请输入相应数字，选择挑战等级：5/7/9，或输入“exit”结束程序。");
		String choice = sc.nextLine();		//将输入值转为字符串
		if("5".equals(choice)) {			//执行等级5游戏方法
			System.out.println("==========已选择等级5==========");
			char[] l5 = level(5) ;		//声明返回值数组
			System.out.println("5位随机字符已生成！请任意输入您的5位字符：");
//测试用语句	System.out.println("为您生成字符：");//测试用语句
//测试用语句	printArr(l5);				//打印数组元素，测试用语句
			lengthConfirm(l5,input());			//送往核对数组长度方法
		}else if("7".equals(choice)) {		//执行等级7游戏方法
			System.out.println("==========已选择等级7==========");
			char[] l7 = level(7) ;
			System.out.println("7位随机字符已生成！请任意输入您的7位字符：");
//测试用语句	System.out.println("为您生成字符：");
//测试用语句	printArr(l7);
			lengthConfirm(l7,input());			//送往核对数组长度方法
		}else if("9".equals(choice)) {		//执行等级9游戏方法
			System.out.println("==========已选择等级9==========");
			char[] l9 = level(9) ;
			System.out.println("9位随机字符已生成！请任意输入您的9位字符：");
//测试用语句	System.out.println("为您生成字符：");
//测试用语句	printArr(l9);
			lengthConfirm(l9,input());			//送往核对数组长度方法
		}else if("exit".equals(choice)) {		//结束程序选项
			System.out.println("程序已结束，感谢使用。");
			System.exit(1);
		}else {							//重新加载方法
			System.out.println("输入值有误，请重新输入。");
			select();
		}
	}

	public static char[] level(int len){			//产生并返回一个指定等级的数组值
		Random rd = new Random();					//导入随机类方法
		char printOut[] = new char[] {'A','B','C','D','E','F','G',
				'H','I','J','K','L','M','N','O','P','Q','R',
				'S','T','U','V','W','X','Y','Z'};	//创建数组并指定数组长度
		boolean mark[] = new boolean[printOut.length];	//定义一个布尔型标记数组及长度
		char lv[] = new char[len];				//创建返回值数组
		for(int i = 0 ; i<lv.length ; i++) {		//遍历for循环返回值数组
			int index;								//声明标签变量
			do{										//通过do..while循环给标签随机赋值
				index = (int)(rd.nextInt(26));
			}while(mark[index]);						//防止生成重复字符元素
			lv[i] = printOut[index];
			mark[index] = true ;					//遍历for循环时对生成过的数值标记为true
		}
		return lv;									//返回指定等级数组值
	}

	public static void printArr(char x[]) {			//字符数组元素输出方法
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
	}
}
