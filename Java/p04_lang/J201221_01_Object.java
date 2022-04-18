package p04_lang;
//학생 클래스
//필드:이름(private)
//생성자:매개변수(이름)
//toString메소드
class Student{
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// 학생의 이름이 같은지 체크
		boolean result = false;
		if (obj instanceof Student) {
			Student stu = (Student)obj;
			if(name.equals(stu.name)) {
				result = true; //이름이 같다면 true
			
					
			}
		
	}
		return result;

	}
	
}

public class J201221_01_Object {

	public static void main(String[] args) {
		//Object클래스 : 모든 클래스의 부모
		// 모든 클래스는 Objec클래스에서 상속
		Student stu = new Student("홍길동");
		Student stu2 = new Student("홍길동");
		//toString메소드
		//System.out.println(stu);

		//equals메소드
		//참조변수는 주소를 가지고있다
		if(stu==stu2) System.out.println("두학생의 이름은 같다");
		else System.out.println("두학생의 이름의 다르다");
		
		
		//student에 equals메소드 재정의
		if (stu.equals(stu2)) 
			System.out.println("두학생의 이름은 같다");
		else 
			System.out.println("두학생의 이름이 다르다");
		
		
	}

}
