package p11_soccer;

public class Master {
	private String userid;
	private String passwd;
	public Master() {}
	public Master(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
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
	@Override
	public String toString() {
		return "Master [userid=" + userid + ", passwd=" + passwd + "]";
	}
	
	
}
