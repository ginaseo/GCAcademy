package p08_jdbc;
//상품 dto
public class Item {
	private String itemcode;
	private String itemname;
	private int price;
	private String regdate;
	
	public Item(){}
	
	public Item(String itemcode, String itemname, int price) {
		super();
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.price = price;
	}

	public Item(String itemcode, String itemname, int price, String regdate) {
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.price = price;
		this.regdate = regdate;
	}
	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
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
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Item [itemcode=" + itemcode + ", itemname=" + itemname + ", price=" + price + ", regdate=" + regdate
				+ "]";
	}
	
}
