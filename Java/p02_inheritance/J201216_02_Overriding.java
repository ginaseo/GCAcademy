package p02_inheritance;
//새 클래스
//부모클래스: 이름(name), 다리수(legs), 날수있다 기능
class Bird{
	private String name="새";
	public static final int legs = 2;
	void flyable(){
		System.out.println("날수있다");
	}
}
//자식클래스: 이름(name), 
//참새, 타조
class Sparrow extends Bird{
	private String name = "참새";
	public String getName() {
		return name;
	}
}

class Ostrich extends Bird{
	private String name = "타조";
	public String getName() {
		return name;
	}
	//어노테이션
	@Override //오버라이딩: 부모클래스의 메소드를 재정의
	void flyable() {
		System.out.println("날수없다");
		
	}

}


public class J201216_02_Overriding {

	public static void main(String[] args) {
		System.out.println("새의 다리수: " +Bird.legs);
		Sparrow sp = new Sparrow();
		Ostrich os = new Ostrich();
		System.out.println(sp.getName()+" ");sp.flyable();
		System.out.println(os.getName()+" ");os.flyable(); 
		
		
		
	}

}
