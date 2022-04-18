package p06_generics;
 
class GTest<T>{
	private T value;
	GTest(T value){
		this.value = value;
	}
	T getName() {
		return value;
	}
	//오버라이딩 메소드
	public String toString() {
		return "값:"+value;
		
	}
}

public class J201121_01_generics {
	public static void main(String[] args) {
		// 제네릭
		// 객체생성시 필드의 타입을 결정
		GTest<String> gt = new GTest<String>("제네릭");
		System.out.println(gt);
		
		GTest<Integer> gt2=new GTest<Integer>(100);
		System.out.println(gt2);
		
		//실수 :3.14를 저장하고 출력
		GTest<Double> gt3=new GTest<>(3.14);
		System.out.println(gt3);
		
		
		
		
		
	}

}
