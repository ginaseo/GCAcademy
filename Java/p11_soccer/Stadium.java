package p11_soccer;

public class Stadium {

	private String stadium_id;
	private String stadium_name;
	private String hometeam_id;
	private int seat_count;
	private String address;
	private String ddd;
	private String tel;
	
	public Stadium() {}

	public Stadium(String stadium_id, String stadium_name, String hometeam_id, int seat_count, String address,
			String ddd, String tel) {
		super();
		this.stadium_id = stadium_id;
		this.stadium_name = stadium_name;
		this.hometeam_id = hometeam_id;
		this.seat_count = seat_count;
		this.address = address;
		this.ddd = ddd;
		this.tel = tel;
	}

	public String getStadium_id() {
		return stadium_id;
	}

	public void setStadium_id(String stadium_id) {
		this.stadium_id = stadium_id;
	}

	public String getStadium_name() {
		return stadium_name;
	}

	public void setStadium_name(String stadium_name) {
		this.stadium_name = stadium_name;
	}

	public String getHometeam_id() {
		return hometeam_id;
	}

	public void setHometeam_id(String hometeam_id) {
		this.hometeam_id = hometeam_id;
	}

	public int getSeat_count() {
		return seat_count;
	}

	public void setSeat_count(int seat_count) {
		this.seat_count = seat_count;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Stadium [stadium_id=" + stadium_id + ", stadium_name=" + stadium_name + ", hometeam_id=" + hometeam_id
				+ ", seat_count=" + seat_count + ", address=" + address + ", ddd=" + ddd + ", tel=" + tel + "]";
	}

	
	
	
}
