package p03_exception;
class Car{
	private String name;
	private int speed;
	Car(String name){
		this.name=name;
	}
	//속도 up 메소드:100넘으면 예외
	//throws:예외 던지기
	//throw:예외 발생 시키기
	void speedUp() throws Exception {
		speed+=1;
		if (speed>100) {
			speed = 100;
			throw new Exception();
		}
	}
	
	
	//속도 down 메소드:50이하면 예외
	void speedDown(int speed) throws Exception {
		speed-=1;
		if (speed<=50) {
			speed = 50;
			throw new Exception();
		}
	}
	
	
}
public class J201218_03_newCar {
	public static void main(String[] args) {
		Car car = new Car("람보르기니");
		for(int i=0; i<105; i++) {
			try{
				car.speedUp();
			}catch (Exception e) {
				System.out.println("속도 예외");
			}
			
		}
	
		
		
		
		
		
	}
}