package ch07.AbstractClass;

public class Tank extends Unit {
	// 공통 부분
	void move(int x, int y) {}
	void stop() {}
	
	// 단독 부분
	void changeMode() {}// 시즈모드(마린만의 고유한 기술)
}
