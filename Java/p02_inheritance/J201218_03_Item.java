package p02_inheritance;

interface ItemInterface{
	String itemType();
	
}


public class J201218_03_Item {

	public static void main(String[] args) {
		ItemInterface item = new ItemInterface() {
			
			@Override
			public String itemType() {
				// TODO Auto-generated method stub
				return "공산품";
			}
		};
	
		System.out.println(item.itemType());
		
		
		
		
		
	}
}