package day01;
//��δ����͵��÷�����
public class Knight {
	public static void main(String args[]) {
		int weapon = 5 ;
		int armor = 10 ;
		Knight equipment = new Knight();
		System.out.println("Knightӵ��"+weapon+"����������"+armor
						+"�����ס�װ���ϼƹ���"+
						equipment.test(weapon , armor)+"����"); 
		//��ֱ��ͨ������������.��������ֱ�ӵ��þ�̬������
	}

	private int add(int weapon ,int armor) {
		int equipment = weapon + armor ;
		return  equipment ;
	}
	
	private int test(int weapon ,int armor) {
		int equipment = weapon * armor ; 
		return equipment ;
	}
	}
