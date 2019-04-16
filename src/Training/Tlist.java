package Training;

public class Tlist {
	//水瓶
	int bottle = 0;
	int water = 0;
	//瓶盖
	int cap = 0;
	public static void main(String[] args) {
		System.out.println(new Tlist().sss(20));
	}
	public int sss(int money){
		
		if(money>0){
			money--;
			water++;
			bottle++;
			cap++;
			sss(money);
		}
		if(bottle>=2){
			bottle-=2;
			water++;
			bottle++;
			cap++;
			sss(money);
		}
		if(cap>=3){
			cap-=3;
			water++;
			bottle++;
			cap++;
			sss(money);
		}
		return water;
	}
}