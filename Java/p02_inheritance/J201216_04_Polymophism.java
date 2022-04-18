package p02_inheritance;
//부모클래스
class Parent{
	void parentM() {
		System.out.println("부모 메소드");
	}
	void childM() {} //컴파일에러를 피하기 위해 만듬

}
//자식클래스
class ChildA extends Parent{
	void childM() {
		System.out.println("자식 메소드");
	}
}
class ChildB extends Parent{
	void childM() {
		System.out.println("자식 메소드");
	}
}



public class J201216_04_Polymophism {
	public static void main(String[] args) {
//		//ChildA객체 생성
//		ChildA cha = new ChildA();
//		cha.parentM();
//		cha.childM();
//		//다형성을 이용햇서 부모의 형으로 참조변수를 만들었다
//		Parent pa = new ChildA();
//		pa.parentM();
//		//불가
//		//컴파일시점:문법적인 에러를 체크
//		//런타임시점에는 부모클래스+자식클래스가 생성므로 사용가능
//		pa.childM();
//		
//		//ChildB객체 생성
		Parent chb = new ChildB();//업캐스팅:자동형변환
//		chb.childM();
		((ChildB)chb).childM();//다운캐스팅:명시적변환

		//instanceof : 참조변수에 클래스 포함여부
		System.out.println(chb instanceof Parent);
		System.out.println(chb instanceof ChildB);
		
		
		
		
//		byte b = 10;
//		int a = b; //자동 형변환
//		byte c = (byte)a;
	}

}
