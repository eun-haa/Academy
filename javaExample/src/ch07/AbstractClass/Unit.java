package ch07.AbstractClass;
// 추상 클래스
public abstract class Unit {
	// Marine,Tank,Dropship의 공통부분을 
	// 추상클래스에 몰아놓음
	int x, y; // 현재 위치
	
	// 추상 메서드는 (); <- 이렇게 끝내기
	// Marine,Tank,Dropship 클래스에서 반드시! 구현해야함
	abstract void move(); // 지정된 위치로 이동
	abstract void stop(); // 현재 위치에 정지
}
