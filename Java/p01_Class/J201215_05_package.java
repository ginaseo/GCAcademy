package p01_Class;

import p01_Class.sub.PackageTest;

public class J201215_05_package {

	public static void main(String[] args) {
		//패키지
		PackageTest test =  new PackageTest();
		System.out.println(test.getA());
		test.setA(200);
		System.out.println(test.getA());


	}

}
