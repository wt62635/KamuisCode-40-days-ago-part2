package day05;
//�����ĵݹ����
public class MethodDemo06 {
	//ͨ���ݹ飬���һ�����ֵ��ۼӲ���
	public static void main(String args[]) {
		System.out.println("1�ۼ���100���ڣ�" + sum(100));
	}
	public static int sum(int num) {
		if( num == 1 ){
		return 1 ;
		}
		else{
		return num  + sum(num-1);	//�ݹ����
		}
	}
}
