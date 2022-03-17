package ch07.modifier;

public class Card {
	final int NUMBER;   // 클래스 변수 // 상수는 반드시 초기화(초기화 안하면 에러)
	final String KIND;  // 클래스 변수 
	static int width=100;  // 인스턴스 변수
	static int hedith=250; // 인스턴스 변수
	
	// 생성자
	// 기본생성자
	//Card(){
		
	//}
	
	// 변수가 두개인 생성자
	Card(int number, String kind){
		NUMBER=number;
		KIND=kind;
	}

}
