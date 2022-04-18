package p02_inheritance;
//책
//부모클래스
abstract class Book{
	//자식클래스가 반드시 구현해야될 메소드 정의 
	abstract String position(); //위치
	abstract int salePer(); //세일율
}
//자식클래스
class Language extends Book{
	private String name="언어";
	@Override
	String position() {
		return "A1-1";
	}
	@Override
	int salePer() {
		return 20;
	}
	@Override
	public String toString() {
		return name;
	}
	
	
}
class Essay extends Book{
	private String name="에세이";	
	@Override
	String position() {
		return "B1-1";
	}
	@Override
	int salePer() {
		return 10;
	}
	@Override
	public String toString() {
		return name;
	}	
}
//책관리 클래스
class BookInfo{
	//책위치 출력
	void positionPrint(Book book) {
		System.out.println(book + " 위치:"+book.position());
	}
	//책의 할인율 출력
	void salePerPrint(Book book) {
		System.out.println(book + " 할인율:" + book.salePer() + "%");
	}
}

public class J201217_03_Book {
	public static void main(String[] args) {
		Language language = new Language();
		Essay essay = new Essay();
		
		BookInfo info = new BookInfo();
		info.positionPrint(language);
		info.positionPrint(essay);
		
		info.salePerPrint(language);
		info.salePerPrint(essay);
		
		
	}

}
