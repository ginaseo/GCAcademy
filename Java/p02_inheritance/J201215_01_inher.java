package p02_inheritance;
//모든 클래스의 최상의 클래스 :Object
//자바는 다중 상속 불가능
//부모클래스/슈퍼클래스/기본클래스 : 상속을 주는쪽
class Person{
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("먹는다");
	}
	
}
//자식클래스/하위클래스/유도클래스 : 상속을 받는 쪽
class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
	
}
//자식
class Student extends Person{
	void learn() {
		System.out.println("배우기");
	}
}

public class J201215_01_inher {
	public static void main(String[] args) {
		// 상속
		Teacher t = new Teacher();
		Student s = new Student();
		t.breath(); t.teach();
		s.breath(); s.learn();

	}

}
