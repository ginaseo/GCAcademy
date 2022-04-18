package p06_generics;

//회원관리 클래스
//필드:아이디(string/integer),패스워드(string/integer)
class Member<T1,T2>{
	private T1 userid;
	private T2 passwd;
	
	Member(T1 userid, T2 passwd){
		this.userid=userid;
		this.passwd=passwd;
	}

	public T1 getUserid() {
		return userid;
	}

	public void setUserid(T1 userid) {
		this.userid = userid;
	}

	public T2 getPasswd() {
		return passwd;
	}

	public void setPasswd(T2 passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + "]";
	}
	
}



public class J201221_03_member {
	public static void main(String[] args) {
		//문자열 : M001/1111
		Member<String,String>m1=new Member<>("M001", "1111");
		System.out.println(m1);
		
		//정수 : 100/2222
		Member<Integer,Integer>m2=new Member<>(100, 2222);
		System.out.println(m2);
		
		
	}
}
