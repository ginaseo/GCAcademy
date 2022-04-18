package p01_Class;
//계산기 클래스(정수/실수계산)
//필드:칼라,계산결과
//생성자:매개변수=>칼라
//게터: 칼라, 계산결과
//세터: 칼라
//메소드 : 더하기(정수),더하기(실수), 빼기(정수), 빼기(실수)
//toString()

class MCal{
	private String color;
	private double result;
	
	//생성자의 오버로딩
	public MCal() {}
	public MCal(String color) {
		this.color = color;
	}
	//게터/세터
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getResult() {
		return result;
	}
	
	//메소드의 오버로딩
	void add(int a) {
		result += a;
	}
	void add(double a) {
		result += a;
	}
	void sub(int a) {
		result -=a;
	}
	void sub(double a) {
		result -=a;
	}
	@Override
	public String toString() {
		return "MCal [color=" + color + ", result=" + result + "]";
	}
	
}
public class J201214_07_MCal {
	public static void main(String[] args) {
		MCal c1 = new MCal(); c1.setColor("노랑");
		c1.add(10); c1.add(20.5);
		System.out.println(c1);
		
	}

}
