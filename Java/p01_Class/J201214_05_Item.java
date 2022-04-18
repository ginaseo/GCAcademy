package p01_Class;
//상품클래스
//필드(private):상품코드, 상품명, 단가
//생성자:매개변수=>상품코드,상품명,단가
//메소드:상품코드(게터),상품명(게터,세터),단가(게터,세터)
//		tostring()

class Item{
	private String code;
	private String name;
	private int price;
	
	
	
	//오버로딩:매개변수의 갯수나 데이터형이 다른 경우 
	//			여러개를 생성가능
	public Item(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	//생성자
	public Item(String code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	//오버라이딩: 부모클래스의 매소드를 자식클래스가 재 정의
	@Override
	public String toString() {
		return "Item [code=" + code + ", name=" + name + ", price=" + price + "]";
	}
	
	
	}
	


public class J201214_05_Item {
	
	public static void main(String[] args) {
		//아이템객체
		Item i1 = new Item("0001","soft_drink",1500);
		System.out.println(i1);
		
		Item i2=new Item("0002", "chips");
		i2.setPrice(2000);
		System.out.println(i2);
		
	}
	
}
