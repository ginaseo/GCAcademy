package p02_inheritance;

import java.util.Scanner;

//인터페이스
//숙박/먹을거리/놀거리
interface Tour {}
interface Stay extends Tour{
	String stay();
}

interface Food extends Tour{
	String food();
}

interface Fun extends Tour{
	String fun();
}


//클래스
//한국/미국/중국
class Korea implements Stay, Food, Fun{
	@Override
	public String fun() {
		return "한강수상스키";
	}
	@Override
	public String food() {
		return "육전";
	}
	@Override
	public String stay() {
		return "한옥마을";
	}
	
}

class China implements Stay, Food, Fun{
	@Override
	public String fun() {
		return "배타기";
	}
	@Override
	public String food() {
		return "마라상궈";
	}
	@Override
	public String stay() {
		return "중국옛터";
	}
	
}

class USA implements Stay, Food, Fun{
	@Override
	public String fun() {
		return "번지점프";
	}
	@Override
	public String food() {
		return "햄버거";
	}
	@Override
	public String stay() {
		return "카우보이마을";
	}
	
}

//여행사 클래스
class TourGuide{
	//숙박 출력
	void stayPrint(Stay stay) {
		System.out.println("숙박시설:"+stay.stay());
	}
	//먹거리 출력
	void foodPrint(Food food) {
		System.out.println("먹거리:"+food.food());
		
	}
	//fun출력
	void funPrint(Fun fun) {
		System.out.println("놀거리:"+fun.fun());
	}

}
public class J201217_06_tour {
	public static void main(String[] args) {
		//사용자에게 관광지 입력받아 출력 
		
		Stay stay = null;
		Food food = null;
		Fun fun = null;
		System.out.println("선택하세요. 1.한국 2.중국 3.미국");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		TourGuide tg = new TourGuide();
//		if (no==1) {
//			Korea korea = new Korea();
//			tg.stayPrint(korea);
//			tg.foodPrint(korea);
//			tg.funPrint(korea);
//			
//		}
//		else if (no==2) {
//			stay = new China();
//			food = new China();
//			fun = new China();
//			
//		}
//		else if (no==3 ) {
//			USA USA = new USA();
//			
//			stay = new USA();
//			food = new USA();
//			fun = new USA();
//			}
		Tour tour = null;
		if (no==1) {
			tour=new Korea();
		}else if (no==2) {
			tour = new China();
		}else if (no==3 ) {
			tour = new USA();
		}
		tg.stayPrint((Stay)tour);
		tg.foodPrint((Food)tour);
		tg.funPrint((Fun)tour);
		
		
		}

	}

