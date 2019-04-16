package Training;
//求水仙花数--do while
public class NarcissusDemo03 {
	public static void main(String[] args) {
		int i = 100 ;
		do {
			int b = i/100;
			int c = (i - b*100)/10;
			int e = i - b*100 - c*10;
			
			if( i ==b*b*b+c*c*c+e*e*e) {
				System.out.println(i);
			}
			i++;
		}while(i<1000);
	}
}
