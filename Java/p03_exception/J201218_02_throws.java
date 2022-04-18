package p03_exception;


public class J201218_02_throws {
//	static void arrayIndex() {
//		try {
//			int[] arr = new int[3];
//			arr[0]=1;arr[3]=3;
//			System.out.println(arr[3]);
//	
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("index 예외");
//		}
//			}
	
	
	//예외 던지기:throws
	//메소드가 간결해지고 가독성이 좋아진다.
	//호출하는 쪽에서 처리 결정 가능
	//언체크예외
	
	static void arrayIndex() throws Exception {
		int[] arr = new int[3];
		arr[0]=1; arr[3]=3;
		System.out.println(arr[3]);
	}
	
	//예외 발생 시키기
	static void throwTest(int a) throws Exception {
		if (a<0) {
			throw new Exception();
		}
	}
	
	public static void main(String[] args) {
	
//		try {
//			J201218_02_throws.arrayIndex();
//		} catch (Exception e) {
//			System.out.println("예외발생");
//			e.printStackTrace();
//		}
//	
	
		//예외 발생을 처리
		try {
			J201218_02_throws.throwTest(-10);
		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	
	}
}