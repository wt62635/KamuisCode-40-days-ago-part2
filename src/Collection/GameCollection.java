package Collection;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class GameCollection {
	public static void main(String[] args) {
		String games[] = {"鬼泣","命令与征服","龙与地下城","勇者斗恶龙","红色警戒","怪物猎人","噬神者","神界","如龙","帝国时代"};
		Map map = new HashMap();
		for (int i = 0; i < games.length; i++) {
			map.put(i+1, games[i]);//遍历字符串数组，按规则存入map集合。
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("依据输入的编号查询游戏库中的一款游戏：");
		try {
			int num = sc.nextInt();
			if(num > 0 && num <=10) {
				System.out.println("编号为：" + num + "的游戏是" + map.get(num) + "");
			}else {
				System.out.println("输入编号错误，结束程序。");
			}			
		}catch(InputMismatchException e) {
			System.out.println("输入错误！只能输入1-10中的某一个整数。");
		}finally {
			System.out.println("程序已结束，欢迎再次启动程序使用。");
			sc.close();
			System.exit(1);
		}
	}
}
