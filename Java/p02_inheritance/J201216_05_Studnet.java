package p02_inheritance;
//부모클래스
//학교
class School{
	void schoolName() {
		System.out.println("국제컴퓨터학교");
	}
}



//자식클래스
//학생
class Stud extends School{
	void nameInfo() {
		System.out.println("홍길동");
	}
	void tellInfo() {
		System.out.println("010-9999-9999");
	}
}

public class J201216_05_Studnet {
	public static void main(String[] args) {
		//부모의 참수변수형으로 자식클래스 생성.
		School std1 = new Stud();
		std1.schoolName();
		((Stud)std1).nameInfo();//다운캐스팅.
		((Stud)std1).tellInfo();
	}

}
