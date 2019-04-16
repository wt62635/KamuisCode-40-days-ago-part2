package Training;
//求一组图形的最大面积
public class CircleAndSquare {
	public static void main(String[] args) {
		Shape shapes[] = new Shape[9];
		shapes[0] = new Circle((double)Math.random()*100);
		shapes[1] = new Circle((double)Math.random()*100);
		shapes[2] = new Circle((double)Math.random()*100);
		shapes[3] = new Square((double)Math.random()*100);
		shapes[4] = new Square((double)Math.random()*100);
		shapes[5] = new Square((double)Math.random()*100);
		shapes[6] = new Hexagon((double)Math.random()*100);
		shapes[7] = new Hexagon((double)Math.random()*100);
		shapes[8] = new Hexagon((double)Math.random()*100);
		for (int i = 0; i < shapes.length; i++) {//遍历输出
			System.out.println("图形面积：" + shapes[i].area() + "，下标：" + i);
		}
		maxShape(shapes);//输出最大图形面积
	}
	public static void maxShape(Shape shapes[]) {//求出最大图像面积方法
		double maxArea = shapes[0].area();
		int maxIndex = 0;
		for (int i = 1; i < shapes.length; i++) {
			double area = shapes[i].area();
			if(area>maxArea) {
				maxArea =  shapes[i].area();
				maxIndex = i;
			}
		}
		System.out.println("最大图形面积：" + maxArea + "，下标：" + maxIndex);
	}
}

abstract class Shape{
	protected double c;
	public abstract double area();
}

class Circle extends Shape{
	public Circle(double c) {
		this.c = c ;
	}
	@Override
	public double area() {
		return 0.0796*c*c;
	}
}

class Square extends Shape{
	public Square(double c) {
		this.c = c;
	}
	@Override
	public double area() {
		return 0.0625*c*c;
	}
}

class Hexagon extends Shape{
	public Hexagon(double c) {
		this.c = c;
	}
	@Override
	public double area() {
		return 0.0721*c*c;
	}
}