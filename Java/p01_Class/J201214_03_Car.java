package p01_Class;
//자동차 클래스
//속성:이름(String), 파워(boolean), 속도(int), 색상(String)
//기능:파워토글, 속도Up(제한속도:100), 속도Down(제한속도:0)
class Car{
	String name = "세단";
	String color;
	boolean power;
	int speed;
	//생성자:객체가 생성이 될때 생성자 자동실행(한번만 실행)
	//반환형이 없고 클래스이름과 동일
	//반드시 존재:생성자가 없으면 자바가 기본생성자 자동생성 

	Car(String color){
		//this : 객체의 주소(객체자기자신)
		//System.out.println(this);
		this.color = color;
	}
	
	void powerToggle() {
		power = !power;
	}
	void speedUp() {
		if (speed < 100) speed++;
	}
	void speedDown() {
		if (speed >0) speed--;
	}
}

public class J201214_03_Car {
	public static void main(String[] args) {
		//자동차 객체생성
		Car c1 = new Car("빨강");
		System.out.println("이름:" + c1.name);
		System.out.println("색상:" + c1.color);
		System.out.println("파워:" + c1.power);
		System.out.println("속도:" + c1.speed);
		//기능테스트
		c1.powerToggle();
		System.out.println("파워:" + c1.power);
		for(int i=0; i<200; i++) c1.speedUp();
		System.out.println("속도:" + c1.speed);
		for(int i=0; i<200; i++) c1.speedDown();
		System.out.println("속도:" + c1.speed);

	}

}
