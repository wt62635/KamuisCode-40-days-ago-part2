package exampleCollection;
/*���⣺���岢����һ����ΪWorker���࣬
 * ���������С����š��������������Լ�3�ſ��ԡ����ӡ������ӹ����͡���װ���ĳɼ���
 * �����ķ����м���3�ſγ̵ġ��ܷ֡�����ƽ���֡�������߷֡�������ͷ֡���
 * 
 * ���������
 * ����5�����ԣ�����(code)������(name)�����ӳɼ�(weld)���ӹ��ɼ�(process)����װ�ɼ�(assemble),��Ҫ��װ��
 * ����4���������ܷ�(sum)��ƽ����(ave)����߷�(max)����ͷ�(min)��
 * 
 */
class Worker {
	private String code ;
	private String name ;
	private float weld ;
	private float process ;
	private float assemble ;
	public Worker(String c , String n, float w , float p , float a) {		//�������Թ��췽��
		code = c ;
		name = n ;
		weld = w ;
		process = p ;
		assemble = a ;
	}
	public void setCode(String c) {
		code = c ;
	}
	public void setName(String n) {
		name = n ;
	}
	public void setWeld(float w) {
		weld = w ;
	}
	public void setProcess(float p) {
		process = p ;
	}
	public void setAssemble(float a) {
		assemble = a ;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public float getWeld() {
		return weld;
	}
	public float getProcess() {
		return process;
	}
	public float getAssemble() {
		return assemble;
	}
	//����ɼ�
	public float sum() {						
		float sum = weld + process + assemble ;		//�ܳɼ�
		return sum ;
	}
	public float ave() {
		float ave = sum() / 3 ;						//ƽ����
		return ave;
	}
	public float max() {
		float max = weld>process?weld:process ;		//��߷�
		max = weld>assemble?weld:assemble ;
		return max ;
	}
	public float min() {
		float min = weld<process?weld:process ;		//��ͷ�
		min = weld<assemble?weld:assemble ;
		return min ;
	}
	public static void main(String[] args) {
		Worker W1 = new Worker("Acer01","Kamui",88.0f,68.0f,92.0f);
		System.out.println("���ţ�" + W1.getCode());
		System.out.println("������" + W1.getName());
		System.out.println("���ӳɼ���" + W1.getWeld());
		System.out.println("�ӹ��ɼ���" + W1.getProcess());
		System.out.println("��װ�ɼ���" + W1.getAssemble());
		System.out.println("�ܳɼ���" + W1.sum());
		System.out.println("��߳ɼ���" + W1.max());
		System.out.println("��ͳɼ���" + W1.min());
		System.out.println("ƽ���ɼ���" + W1.ave());
	}
}
