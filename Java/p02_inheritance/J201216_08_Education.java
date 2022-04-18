package p02_inheritance;
//부모클래스
class Education{
	private String name ="교육청";
	int scoreCal(int score) {
		return 0;
	}
}


//자식클래스
class High extends Education {
	private String name ="고등학교";
	int scoreCal(int score) {
		return score*5;
	}
	@Override
	public String toString() {
		return name;
	}
}

class Middle extends Education {
	private String name ="중학교";
	int scoreCal(int score) {
		return score*7;
	}
	@Override
	public String toString() {
		return name;
	}
}

class Elementary extends Education {
	private String name ="초등학교";
	int scoreCal(int score) {
		return score*10;
	}

	@Override
	public String toString() {
		return name;
	}

}


//성적출력 클래스
class ScoreInfo{
	void scorePrint(Education edu, int score) {
		System.out.println(edu+":");
		System.out.println(edu.scoreCal(score));
	}
}




public class J201216_08_Education {

	public static void main(String[] args) {
	 Elementary ele = new Elementary();
	 Middle mid = new Middle();
	 High hig = new High();
	 
	 ScoreInfo info = new ScoreInfo();
	 info.scorePrint(ele,10);
	 info.scorePrint(mid,10);
	 info.scorePrint(hig,10);
	 

	}

}
