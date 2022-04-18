package p02_inheritance;
interface AnonymousTest{
	void methodTest();
}

//class Sample implements AnonymousTest{
//
//	@Override
//	public void methodTest() {
//		System.out.println("메소드 테스트");
//	}
//	
//}



public class J201218_02_anonymous_interface {

	public static void main(String[] args) {
//		Sample sample = new Sample();
//		sample.methodTest();

		//익명클래스
		new AnonymousTest() {
			
			@Override
			public void methodTest() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
	}

}
