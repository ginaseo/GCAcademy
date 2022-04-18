package p09_member;

import java.util.Date;
//dto
public class Member {
	private String userid;
	private String passwd;
	private String email;
	private String name;
	private String phone;
	private Date regdate;
	public Member() {
	}
	public Member(String userid, String passwd, String email, String name, String phone, Date regdate) {
		this.userid = userid;
		this.passwd = passwd;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.regdate = regdate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + ", email=" + email + ", name=" + name + ", phone="
				+ phone + ", regdate=" + regdate + "]";
	}
	
	
	
}
