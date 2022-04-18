package p02_inheritance;

//부모클래스
class MyCar{
	static final String carName = "마이스포츠카";
}

//자식클래스
class Tire extends MyCar{
	private String company;
	Tire(String compnay){
		this.company =compnay; 
	}
	@Override
	public String toString() {
		return company+" 타이어";
	}
}


class Mirror extends MyCar{
	private String company;
	Mirror(String company){
		this.company =company;
	}
	@Override
	public String toString() {
		return company+" 미러";
	}
	
	
}

//수리업체 클래스
class Repair{
	//부품을 체인지 해주는 기능
	void changePart(MyCar car) {
		//타이어(금호)교체완료
		System.out.println(car+" 교체완료");
	}
}

public class J201216_07_Mycar {
	public static void main(String[] args) {
		Tire tire = new Tire("금호");
		Mirror mirror = new Mirror("모비스");
		
		Repair re = new Repair();
		re.changePart(tire);
		re.changePart(mirror);
	}

}
