package ch06;
// 생성자를 이용한 초기화
public class Car2 {
	// 색상
	String color;
	// 변속기 종류 - auto, manua1
	String gearType;
	// 문의 갯수
	int door;
	
	Car2(){ // 기본생성자
		// 기본생성자에서 아래의 Car2를 호출하게 됨
		this("red", "manual", 4);
	}
	
	Car2(Car2 c){
		// 하단의 String color, String gearType, int door
		// 주소를 이용해서 값을 복사할 수 있음
		this.color=c.color;
		this.gearType=c.gearType;
		this.door=c.door;
	}
	
	Car2(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}
