package p11_soccer;

public class Team {
	private String team_id;
	private String region_name;
	private String team_name;
	private String e_team_name;
	private String orig_yyyy;
	private String stadium_id;
	private String zip_code1;
	private String zip_code2;
	private String address;
	private String ddd;
	private String tel;
	private String fax;
	private String homepage;
	private String owner;
	
	public Team() {}

	public Team(String team_id, String region_name, String team_name, String e_team_name, String orig_yyyy,
			String stadium_id, String zip_code1, String zip_code2, String address, String ddd, String tel, String fax,
			String homepage, String owner) {
		super();
		this.team_id = team_id;
		this.region_name = region_name;
		this.team_name = team_name;
		this.e_team_name = e_team_name;
		this.orig_yyyy = orig_yyyy;
		this.stadium_id = stadium_id;
		this.zip_code1 = zip_code1;
		this.zip_code2 = zip_code2;
		this.address = address;
		this.ddd = ddd;
		this.tel = tel;
		this.fax = fax;
		this.homepage = homepage;
		this.owner = owner;
	}

	public String getTeam_id() {
		return team_id;
	}

	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getE_team_name() {
		return e_team_name;
	}

	public void setE_team_name(String e_team_name) {
		this.e_team_name = e_team_name;
	}

	public String getOrig_yyyy() {
		return orig_yyyy;
	}

	public void setOrig_yyyy(String orig_yyyy) {
		this.orig_yyyy = orig_yyyy;
	}

	public String getStadium_id() {
		return stadium_id;
	}

	public void setStadium_id(String stadium_id) {
		this.stadium_id = stadium_id;
	}

	public String getZip_code1() {
		return zip_code1;
	}

	public void setZip_code1(String zip_code1) {
		this.zip_code1 = zip_code1;
	}

	public String getZip_code2() {
		return zip_code2;
	}

	public void setZip_code2(String zip_code2) {
		this.zip_code2 = zip_code2;
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

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Team [team_id=" + team_id + ", region_name=" + region_name + ", team_name=" + team_name
				+ ", e_team_name=" + e_team_name + ", orig_yyyy=" + orig_yyyy + ", stadium_id=" + stadium_id
				+ ", zip_code1=" + zip_code1 + ", zip_code2=" + zip_code2 + ", address=" + address + ", ddd=" + ddd
				+ ", tel=" + tel + ", fax=" + fax + ", homepage=" + homepage + ", owner=" + owner + "]";
	}
	
	
	
}
