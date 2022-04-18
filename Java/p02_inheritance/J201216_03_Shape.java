package p02_inheritance;
//모양클래스
//부모클래스:필드(height, width)
//생성자(height,width)
//기능(넓이:hight*width)
class Shape{
	protected int height;
	protected int width;
	Shape(int height, int width){
		this.height=height;
		this.width=width;
	}
	//메소드의 final: 오버라이딩 불가
	//자식클래스가 재정의해서 메소드를 사용못하게 한다
	
	//finall double area() {
	double area() {
		return height*width;
	}

	@Override
	public String toString() {
		return "Shape [height=" + height + ", width=" + width + "]";
	}

	
	
}
//자식클래스
class Retangle extends Shape{

	Retangle(int height, int width) {
		super(height, width);
		
	}
	
}

class Triangle extends Shape{

	Triangle(int height, int width) {
		super(height, width);
		
	}
	//넓이:height*width/2

	@Override
	double area() {
		// TODO Auto-generated method stub
		return (height*width)/2;
	}
	
}
public class J201216_03_Shape {

	public static void main(String[] args) {
		Retangle re = new Retangle(10,20);
		System.out.println("사각형의 넓이: "+re.area());
		Triangle tr = new Triangle(10, 20);
		System.out.println("삼각형의 넓이: "+tr.area());
		
		System.out.println("사각형의 " +re);
		System.out.println("삼각형의 " +tr);
	}

}
