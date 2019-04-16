package javaday04;

class JieDian{
	private String top ;
	private JieDian part ;
	public JieDian(String top) {
		this.top = top ;
	}
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public JieDian getPart() {
		return part;
	}
	public void setPart(JieDian part) {
		this.part = part;
	}
}
public class NodeDemo02 {
	public static void main(String[] args) {
		JieDian jd = new JieDian("头部");
		JieDian jd2 = new JieDian("上半身");
		JieDian jd3 = new JieDian("腰部");
		JieDian jd4 = new JieDian("下半身");
		JieDian jd5 = new JieDian("腿部");
		jd.setPart(jd2);
		jd2.setPart(jd3);
		jd3.setPart(jd4);
		jd4.setPart(jd5);
		printJieDian(jd);
	}
	public static void printJieDian(JieDian jiedian) {
		System.out.println(jiedian.getTop() + "\t");
		if(jiedian.getPart()!=null) {
			printJieDian(jiedian.getPart());
		}
	}
}
