package p01_Class;
//상품클래스
//필드(private):상품코드, 상품명, 단가
//생성자:매개변수=>상품코드, 상품명, 단가
//메소드:상품코드(게터), 상품명(게터,세터), 단가(게터,세터)
//		toString()
class Item{
	private String itemcode;
	private String itemname;
	private int price;
	//생성자를 생성하면 기본생성자 생성 안됨
	//오버로딩:매개변수의 갯수나 데이터형이다른 경우 
	//		동일한 이름의 매소드를 여러개 생성 가능
	public Item(String itemcode, String itemname) {
//		super(); //부모클래스의 생성자:상속클래스 학습시 자세한 설명
		this.itemcode = itemcode;
		this.itemname = itemname;
	}
	public Item(String itemcode, String itemname, int price) {
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.price = price;
	}
	public String getItemcode() {
		return itemcode;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//오버라이딩 : 부모클래스의 메소드를 자식클래스가 재정의
	@Override
	public String toString() {
		return "Item [itemcode=" + itemcode + ", itemname=" + itemname + ", price=" + price + "]";
	}
	
}

public class J201214_06_Item {
	public static void main(String[] args) {
		// 상품객체 생성
		Item item1 = new Item("8801", "사이다", 1500);
		System.out.println(item1);
		
		Item item2 = new Item("8802", "콜라");
		item2.setPrice(2000);
		System.out.println(item2);
		
	}

}
