package day08;

public class TrimTest02 {		
	public static boolean isEmpty( String S1 ) {	//����һ��isEmpty�жϷ����ж��ַ�������S1
        if ( null == S1 || "".equals(S1)) {			//���S1��ֵ����null(��)����ڴ��е�S1��ֵ��"(��)"��ȫ���
            return true;							//�򷵻�ֵΪtrue
        } else if ( "".equals(S1.trim()) ) {		//�������S1��ֵͨ��.trim()����ȥ������հ׺�
            return true;							//���ڴ��ֵ��"(��)"��ȫ��ȣ��򷵻�ֵΪtrue
        }
        return false;								//����Ϊ����ֵΪfalse
    }
	public static void main(String[] args) {
		System.out.println(isEmpty("   "));			//��S1��ֵ�����ո�������Ϊtrue��
	}
}