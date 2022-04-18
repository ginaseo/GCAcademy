package p01_Class;
//멤버 클래스
//필드 : 아이디, 패스워드, 이메일
//필드의 접근제한자 : private :클래스 내부에서만 접근 가능
//					 public : 어떤 클래스에서도 접근 가능
//					 아무것도 안붙일때 : default :같은 패키지에서만 접근가능
//객체지향언어의 특징 : 은닉화/캡슐화
// 은닉화의 목적 : 원하는 대로 getter/setter 생성(즉 읽기전용 가능)
//				데이터의 무결성

class Member{
	private String id;
	private String pw;
	private String email;
	//생성자
	Member(String id, String pw, String email){
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	//아이디 리턴해주는 메소드:게터
	String getId() {
		return id;
	}
//	//아이디 변경 메소드:세터
//	void setId(String id) {
//		this.id = id;
//	}
	
	//패스워드 읽기 메소드(getter)
	String getPw() {
		//패스워드 앞 두자리만 리턴
		return pw.substring(0,2)+"**";
	}
	//패스워드 변경 메소드(setter)
	void setPw(String pw) {
		this.pw = pw;
	}
	//이메일 게터 (getter)
	String getEmail() {
		return email;
	}
	//이메일 세터(setter)
	void setEmail(String email) {
		//데이터의 무결성 검사
		if (email.indexOf("@") == -1)
			System.out.println("잘못된 형식의 이메일입니다.");
		else
			this.email = email;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + "]";
	}
	
}

public class J201214_05_Member {

	public static void main(String[] args) {
		// 멤버객체
		Member m1 = new Member("hong", "1111", "hong@gmail.com");
		System.out.println(m1);
		m1.setPw("2222");
		System.out.println(m1);
		System.out.println(m1.getId());
		m1.setEmail("gildong");
		System.out.println(m1);
		System.out.println("패스워드:" + m1.getPw());
	}

}
