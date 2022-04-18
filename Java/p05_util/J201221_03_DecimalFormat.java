package p05_util;

import java.text.DecimalFormat;

public class J201221_03_DecimalFormat {

	public static void main(String[] args) {
		// 숫자를 형식화
		//#,0,+/-
		float pi =53.14f;
		
		//#:있는 자리수만
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println(df.format(pi));
		
		//0:자릿수 고정
		DecimalFormat df2 = new DecimalFormat("-000.000%");
		System.out.println(df2.format(pi));
		
		//,:자릿수,
		DecimalFormat df3 = new DecimalFormat(",###.000%");
		System.out.println(df3.format(pi));
		
	}

}
