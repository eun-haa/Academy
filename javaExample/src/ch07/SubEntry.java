package ch07;
// Entry 클래스 상속
public class SubEntry extends Entry{
	// 변수(필드명)
	String definition;
	int year;
	
	// 메서드
	
	public void printView() {// 원어, 시기 출력
		System.out.println("원어 : Object Oriented Programming");
		System.out.println("시기 : 1991년");
	}
}
