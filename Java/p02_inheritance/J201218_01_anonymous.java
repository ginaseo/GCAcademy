package p02_inheritance;
//부모클래스
class Dog{
	void eat() {
		System.out.println("먹을 수 있다");
	}
	void walk() {
		System.out.println("걸을 수 있다");
	}
}
//class HurtDog extends Dog{
//	@Override
//	void walk() {
//		System.out.println("걸을 수 없다");
//	}
//}
public class J201218_01_anonymous {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
//		HurtDog htdog = new HurtDog();
//		htdog.eat();
//		htdog.walk();
		
		
		//익명클래스
		Dog hdog = new Dog() {
			@Override
			void walk() {
				System.out.println("걸을 수 없다");
			}
			
			void sleep() {
				System.out.println("자고 있다");
			}
		};
		
		hdog.walk();
		hdog.eat();
		hdog.
		
		
		
		
	}	

}
