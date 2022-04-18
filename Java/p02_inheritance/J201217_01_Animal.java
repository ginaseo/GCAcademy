package p02_inheritance;
//동물원
//부모클래스
//추상클래스:추상메소드를 한개라도 포함하는 클래스
abstract class Animal{
	private String name ="동물";
	//추상메소드:구현부가 없다
	abstract String openTime(); 
}
//자식클래스
class Rabbit extends Animal{
	private String name="토끼";
	String openTime() {
		return "9:00~13:00";
	}
	public String toString() {
		return name;
	}
}
class Lion extends Animal{
	private String name="사자";
	String openTime() {
		return "14:00~15:00";
	}
	public String toString() {
		return name;
	}
}
//사육사
class AnimalCare{
	//동물들에게 먹이주기
	void eating(Animal animal) {
		System.out.println(animal + " 먹는다");
	}
	//동물들 산책하기
	void walking(Animal animal) {
		System.out.println(animal + " 산책하다");
	}
	void opening(Animal animal) {
		System.out.println(animal + "오픈시간:" + animal.openTime());
	}
	
}

public class J201217_01_Animal {
	public static void main(String[] args) {
		//추상클래스는 객체생성 불가
//		new Animal();
		
		//토끼, 사자의 객체생성
		Rabbit rabbit = new Rabbit();
		Lion lion = new Lion();
		//사육사객체생성
		AnimalCare care = new AnimalCare();
		care.eating(rabbit);
		care.eating(lion);
		care.walking(lion);
		care.opening(rabbit);
		care.opening(lion);
		
		
		
		
		
		
		
	}

}
