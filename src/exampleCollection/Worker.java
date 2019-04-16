package exampleCollection;
/*例题：定义并测试一个名为Worker的类，
 * 包括属性有“工号”、“姓名”，以及3门考试“焊接”、“加工”和“组装”的成绩，
 * 包括的方法有计算3门课程的“总分”、“平均分”、“最高分”及“最低分”。
 * 
 * 问题分析：
 * 共有5个属性：工号(code)、姓名(name)、焊接成绩(weld)、加工成绩(process)、组装成绩(assemble),需要封装。
 * 共有4个方法：总分(sum)、平均分(ave)、最高分(max)、最低分(min)。
 * 
 */
class Worker {
	private String code ;
	private String name ;
	private float weld ;
	private float process ;
	private float assemble ;
	public Worker(String c , String n, float w , float p , float a) {		//声明属性构造方法
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
	//计算成绩
	public float sum() {						
		float sum = weld + process + assemble ;		//总成绩
		return sum ;
	}
	public float ave() {
		float ave = sum() / 3 ;						//平均分
		return ave;
	}
	public float max() {
		float max = weld>process?weld:process ;		//最高分
		max = weld>assemble?weld:assemble ;
		return max ;
	}
	public float min() {
		float min = weld<process?weld:process ;		//最低分
		min = weld<assemble?weld:assemble ;
		return min ;
	}
	public static void main(String[] args) {
		Worker W1 = new Worker("Acer01","Kamui",88.0f,68.0f,92.0f);
		System.out.println("工号：" + W1.getCode());
		System.out.println("姓名：" + W1.getName());
		System.out.println("焊接成绩：" + W1.getWeld());
		System.out.println("加工成绩：" + W1.getProcess());
		System.out.println("组装成绩：" + W1.getAssemble());
		System.out.println("总成绩：" + W1.sum());
		System.out.println("最高成绩：" + W1.max());
		System.out.println("最低成绩：" + W1.min());
		System.out.println("平均成绩：" + W1.ave());
	}
}
