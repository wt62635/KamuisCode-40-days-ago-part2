package day06;
//��װ�����Է��ʸ�ֵʱ�������жϡ��������򲻸�ֵ��
class Birthday {
	String NameErro = "��������";
	int numErro = 0;
	private String Name;

	public void setName(String n) {
		 if (n != "Kamui") {
			Name = NameErro ;
		}
		 else {
		 Name = n ;
	 }
	}	
	
	private int year ;
	public void setYear(int y) {
		if (y>2019 || y<1900) {
			year = numErro ;
		}
		else {
			year = y ;
		}
	}

	private int month;
	public void setMonth(int m) {
		if (m > 12 || m < 1) {
			System.out.println("�·���������");
			month = numErro;
		} else {
			month = m;
		}
	}

	private int day;
	public void setDay(int d) {
		if (d > 31 || d < 1) {
			System.out.println("������������");
			day = numErro;
		} else {
			day = d;
		}
	}

	public void tell() {
		System.out.println(Name + "||" + year + "||" + month + "||" + day);
	}
}

public class Demo04 {
	public static void main(String args[]) {
		Birthday Man = new Birthday();
		Man.setName("Kamui");
		Man.setYear(1900);
		Man.setMonth(0);
		Man.setDay(32);
		Man.tell();
	}
}