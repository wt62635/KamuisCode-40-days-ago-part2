package day05;

import java.util.Scanner; //����Scanner����

public class ScannerDemo01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); //�Ӽ��̽�������
		System.out.println("����������:");
		int age = scan.nextInt();	//next��ʽ�������ͱ���
		System.out.println(age);	//�������ֵ
	/*����Ҳ�������ˡ�����˳������չһ�°�*/
		if(scan.hasNext()) {		
	//������������������ȡ,����Ҫ���ѭ�����������if�滻��while����
			int scan1 = scan.nextInt();
			System.out.println(scan1);
		}
		scan.close(); 
	//������ȡ�û�����ֵ�������if��Ϊwhileѭ�����򽫲����������ˡ�
	}
}
