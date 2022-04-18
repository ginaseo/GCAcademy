package p02_inheritance;
//자동차
//부모클래스:전진, 후진
class Car{
	private String color;
	private int highSpeed; //최고제한속도
	//생성자:객체가 생성될때 반드시 실행되어야 한는 메소드
	
	//생성자는 상속 안됨
	//Car(){}
	Car(int highSpeed){
		this.highSpeed = highSpeed;
	}
	Car(String color){
		this.color = color;
	}
	void forward() {
		System.out.println("전진주행");
	}
	void backward() {
		System.out.println("후진주행");
	}
}

//자식클래스:자율주행
class NewCar extends C5ar{
	
	//생성자
	NewCar(String color){
		//super();
		super(color); //부모의 생성자
		//super(100);
	}
	void autodriving() {
		System.out.println("자율주행");
	}
}

//자식클래스:스마트자동차
class SmartCar extends Car{
	SmartCar(String color){
		super(color);
	}
	void smart() {
		System.out.println("스마트한 기능");
	}
}

public class J201215_03_Car {

	public static void main(String[] args) {
		NewCar nc = new NewCar("노랑");
		nc.forward();
		nc.backward();
		nc.autodriving();
		SmartCar sc = new SmartCar("빨강");
		
		

	}

}
