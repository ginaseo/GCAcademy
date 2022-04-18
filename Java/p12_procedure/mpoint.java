package p12_procedure;

public class mpoint {
	private String userid;
	private int point;
	
	public mpoint() {}

	public mpoint(String userid, int point) {
		super();
		this.userid = userid;
		this.point = point;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "mpoint [userid=" + userid + ", point=" + point + "]";
	}
	
	
	
	
	
}
