package p02_inheritance;

import java.util.Scanner;

//포켓몬
//부모클래스
abstract class Pokemon{
	private String name;
	//생성자
	Pokemon(String name){
		this.name = name;
	}
	//게터
	String getName() {
		return name;
	}
	//추상메소드
	//? : 다형성을 이용 
	//? : 자식메소드들이 같은 이름의 메소드를 정의(강제)
	abstract void attack(); //공격
	abstract void sound(); //소리
	
}
//피카츄
class Pikachu extends Pokemon{
	Pikachu(String name) {
		super(name);
	}
	//공격메소드 / 소리메소드
	@Override
	void attack() {
		System.out.println("전기공격");
	}

	@Override
	void sound() {
		System.out.println("피카!피카~~");
	}

}
//꼬부기
class Squirtle extends Pokemon{
	Squirtle(String name) {
		super(name);
	}
	//공격메소드 / 소리메소드
	@Override
	void attack() {
		System.out.println("물공격");
	}
	@Override
	void sound() {
		System.out.println("꼬북~~꼬북~~");
	} 
}

//게임클래스
class GamePlay{
	//피카피카 전기공격
	//꼬북꼬북 물공격
	void attackPlay(Pokemon pokemon) {
		System.out.print(pokemon.getName()+":");
		pokemon.attack();
	}
	
	void soundPlay(Pokemon pokemon) {
		System.out.print(pokemon.getName());
		pokemon.sound();
	}
}

public class J201217_02_Pokemon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("◑?◐ :");
		String player1 = sc.nextLine();
		System.out.print("(*^▽^*) :");
		String player2 = sc.nextLine();
		
		//피카츄/꼬부기 객체생성
		Pikachu pikachu = new Pikachu(player1);
		Squirtle squirtle = new Squirtle(player2);
		
		//게임시작
		GamePlay gplay = new GamePlay();
		while(true) {
			System.out.println("--------------");
			System.out.println("◑?◐ 1:공격");
			System.out.println("◑?◐ 2:소리");
			System.out.println("(*^▽^*) 3:공격");
			System.out.println("(*^▽^*) 4:소리");
			System.out.println("--------------");
			System.out.print("골라봐!!!");
			int no = sc.nextInt();
			if (no == 1) {
				gplay.attackPlay(pikachu);
			}else if (no==2){
				gplay.soundPlay(pikachu);
			}else if (no==3){
				gplay.soundPlay(squirtle);
			}else if (no==4){
				gplay.soundPlay(squirtle);
			}else {
				System.out.println("다시선택");
			}
			
		}

	}

}
