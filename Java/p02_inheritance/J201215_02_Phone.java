package p02_inheritance;
//핸드폰
//부모클래스:전화걸기, 사진찍기
class Phone{
	void call() {
		System.out.println("전화걸기");
	}
	void photo() {
		System.out.println("사진찍기");
	}
	
}

//자식클래스:
//추가기능 : 블루투스
class NewPhone extends Phone{
	void blueTooth() {
		System.out.println("블루투스 통신");
	}
}
//NewPhone의 자식
//추가기능 : 자동결재
class SmartPhone extends NewPhone{
	void autoPay() {
		System.out.println("자동결재 됨");
	}
}

public class J201215_02_Phone {

	public static void main(String[] args) {
		NewPhone newPhone = new NewPhone();
		newPhone.call();
		newPhone.photo();
		newPhone.blueTooth();
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call();
		smartPhone.blueTooth();
		smartPhone.autoPay();
		

	}

}
