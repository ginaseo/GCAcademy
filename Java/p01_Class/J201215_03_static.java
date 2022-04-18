package p01_Class;

class StaticTest{
	//final : 상수(변경불가능) :반드시 초기값 같이 생성
	//static : 공용멤버
	//static final : 공용 상수
	static final double PI;
	//초기화 블럭
	//문장을 이용해서 초기화 가능:예를 들면 파일에서 또는 db에서 데이터를 읽어와야 할때
	static {
		PI = 3.14;
	}
	
	private int a=10; //인스턴스 필드(객체에 생성)
	private static int b = 20; //클래스(스태틱) 필드 : 공용(static)메모리에 생성
	int getA() { //인스턴스 메소드
		return a;
	}
	static int getB() { //클래스 메소드
		return b;
	}
	
	void printValue() { //인스턴스 메소드
		System.out.println("인스턴스필드:" + a);
		System.out.println("클래스필드:" + b);
	}
	
	static void printStaticValue() { //클래스 메소드:프로그램 실행시 생성
		//클래스 필드만 사용가능
		System.out.println("클래스필드:" + b);
		//System.out.println("인스턴스필드:" + a); //에러:객체생성시
	}
}
public class J201215_03_static {
	public static void main(String[] args) {
		// static 필드 : 클래스 이름으로 접근이 가능
		// 프로그램 실행시점에 생성, 프로그램이 종료 될때 소멸
		
		//StaticTest.pi = 3.99;
		
		
//		System.out.println(StaticTest.b);		
		
		StaticTest st = new StaticTest();
//		System.out.println(st.b);
//		System.out.println(st.a);
		st.printValue();
		
		
		System.out.println(StaticTest.getB());
		
		System.out.println(Math.PI);
		System.out.println(StaticTest.PI);
		

		

	}

}
