package p10_zodiac;
//12간지 dto
public class ZodiacSign {
	private int seq;
	private String zodiac;
	private String content;
	public ZodiacSign() {
	}
	public ZodiacSign(int seq, String zodiac, String content) {
		this.seq = seq;
		this.zodiac = zodiac;
		this.content = content;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getZodiac() {
		return zodiac;
	}
	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ZodiacSign [seq=" + seq + ", zodiac=" + zodiac + ", content=" + content + "]";
	}
	
	
	
}
