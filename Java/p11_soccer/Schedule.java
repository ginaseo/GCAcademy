package p11_soccer;

public class Schedule {

	private String stadium_id;
	private String sche_date;
	private String gubun;
	private String hometeam_id;
	private String awayteam_id;
	private int home_score;
	private int away_score;
	public Schedule() {}
	public Schedule(String stadium_id, String sche_date, String gubun, String hometeam_id, String awayteam_id,
			int home_score, int away_score) {
		super();
		this.stadium_id = stadium_id;
		this.sche_date = sche_date;
		this.gubun = gubun;
		this.hometeam_id = hometeam_id;
		this.awayteam_id = awayteam_id;
		this.home_score = home_score;
		this.away_score = away_score;
	}
	public String getStadium_id() {
		return stadium_id;
	}
	public void setStadium_id(String stadium_id) {
		this.stadium_id = stadium_id;
	}
	public String getSche_date() {
		return sche_date;
	}
	public void setSche_date(String sche_date) {
		this.sche_date = sche_date;
	}
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	public String getHometeam_id() {
		return hometeam_id;
	}
	public void setHometeam_id(String hometeam_id) {
		this.hometeam_id = hometeam_id;
	}
	public String getAwayteam_id() {
		return awayteam_id;
	}
	public void setAwayteam_id(String awayteam_id) {
		this.awayteam_id = awayteam_id;
	}
	public int getHome_score() {
		return home_score;
	}
	public void setHome_score(int home_score) {
		this.home_score = home_score;
	}
	public int getAway_score() {
		return away_score;
	}
	public void setAway_score(int away_score) {
		this.away_score = away_score;
	}
	@Override
	public String toString() {
		return "Schedule [stadium_id=" + stadium_id + ", sche_date=" + sche_date + ", gubun=" + gubun + ", hometeam_id="
				+ hometeam_id + ", awayteam_id=" + awayteam_id + ", home_score=" + home_score + ", away_score="
				+ away_score + "]";
	}
	
	
}
