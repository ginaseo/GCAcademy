package p01_Class;
//학생클래스
//필드:학교명(String), 이름(String), 학년(int), 평균(double)
//생성자:매개변수=>이름,학년
//메소드:학년변경,평균구하기(점수배열), 학생 정보 반환

class Student{ //F4누르고 상속 확인
	String schoolName="국제컴퓨터";
	String name;
	int grade;
	double avg;
	//생성자
	Student(String name,int grade){
		this.name = name;
		this.grade = grade;
	}
	//학년변경
	void setGrade(int grade) {
		this.grade = grade;
	}
	//평균구하기
	void getAvg(int[] scores) {
		int sum=0;
		for(int score :scores)
			sum += score;
		avg = (double)sum / scores.length;
	}
//	//학생정보 반환
//	String stdInfo() {
//		return "학교명:" + schoolName +"\n" 
//		   	 + "이름:" + name  +"\n"
//		   	 + "학년:" + grade + "\n"
//		   	 + "평균:" + avg;
//	}
	//어노테이션
	//@Override : 부모의 메소드를 재정의
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + name + ", grade=" + grade + ", avg=" + avg + "]";
	}
	
}
public class J201214_04_Student {
	public static void main(String[] args) {
		// 학생 객체 생성
		Student s1 = new Student("홍길동",1);
		s1.getAvg(new int[] {88,89,95});
		//학생정보출력
		System.out.println(s1); //println메소드가 주소만 넘길때 자동 toString실행
		//학년변경
		s1.setGrade(2);
		System.out.println(s1);
		
	}

}
