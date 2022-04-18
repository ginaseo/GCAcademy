package p10_zodiac;
//dto :
public class Member {
	private String userid;
	private int year;
	private String regdate;
	//생성자
	public Member() {}
	public Member(String userid, int year) {
		this.userid = userid;
		this.year = year;
	}
	public Member(String userid, int year, String regdate) {
		this.userid = userid;
		this.year = year;
		this.regdate = regdate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", year=" + year + ", regdate=" + regdate + "]";
	}
	
	
}
