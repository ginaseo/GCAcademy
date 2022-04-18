package p02_inheritance;
//인터페이스
//클래스들간의 매개역활하기 위한 용도
//구현하기 위한 목적이 아니다
//객체생성 안됨
interface TestA{
	//static final 이 생략
	int a=100; //static 상수가능
	//추상메소드가 목적
	//abstract가 디폴트:생략가능
	//abstract void methodA();
	void methodA();
	//구현해야할 메소드가 필요하면 default  
	default void methodAA() {}
}

interface TestB{
	//추상메소드
	void methodB();
}

//인터페이스를 구현
//다중상속이 가능
class TestC implements TestA,TestB {

	@Override
	public void methodB() {
		System.out.println("메소드 B");
	}
	@Override
	public void methodA() {
		System.out.println("메소드 A");
	}
	
}

public class J201217_04_interface {
	public static void main(String[] args) {
		TestC testc = new TestC();
		testc.methodA();
		testc.methodB();
		
		System.out.println(TestA.a); 
		
		//다형성
		TestA ta = new TestC();
		TestB tb = new TestC();
		TestC tc = new TestC();
		
		//출력
		ta.methodA();
		tb.methodB();
		tc.methodA();
		tc.methodB();
		
		
		
		
		
		
		
	}

}
