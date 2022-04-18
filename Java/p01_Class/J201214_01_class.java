package p01_Class;
//public 클래스 이름과 java파일 이름은 동일하여야 한다
//즉 하나의 java파일에 class를 여러개 만들수는 있다
//하지만 public class는 하나의 java파일에 한개만 가질수 있다
//하나의 java파일에 class를 여러개 만들더라도 빌드하면 class별로 
//	클래스이름.class가 각각 만들어 진다


//강아지 클래스
class Dog{
	//속성(필드):자동초기화
	String type="강아지";
	int legs = 4;
	int totCnt; //걸음수:0으로 자동 초기화
	//동작,기능(메소드)
	void walk(String name, int cnt) {
		totCnt += cnt;
		System.out.println(name + cnt + "걸음 걸어갑니다.");
	}
	
}

public class J201214_01_class {

	public static void main(String[] args) {
		// 클래스에서 객체 생성
		//d : 참조변수 : 객체의 주소를 저장하는 변수
		//인스턴스변수 
		Dog d =new Dog();
		System.out.println(d.type);
		System.out.println(d.legs);
		d.walk("발발이",5);
		System.out.println("총걸음수:"+d.totCnt);
		d.walk("발발이",3);
		System.out.println("총걸음수:"+d.totCnt);
	}

}
