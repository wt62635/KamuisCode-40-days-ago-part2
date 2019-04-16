package Training;
//求水仙花数--for
public class NarcissusDemo01 {
	public static void main(String[] args) {
		for(int i = 100;i<1000;i++) {
			int b = i/100;		
			int s = (i-100*b)/10;		
			int g = (i-s*10-b*100);
			
			if(i==g*g*g+s*s*s+b*b*b) {
				System.out.println(i);
			}
		}
	}
}


