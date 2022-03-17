package ch07.AbstractClass;

public class Marine extends Unit {
	// 공통 부분
	void move(int x, int y) {}
	void stop() {}
	
	// 단독 부분
	void stimpack() {}// 스팀팩(마린만의 고유한 기술)
}
