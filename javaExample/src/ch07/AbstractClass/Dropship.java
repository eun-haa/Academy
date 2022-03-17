package ch07.AbstractClass;

public class Dropship extends Unit {
	// 공통 부분
	void move(int x, int y) {}
	void stop() {}
	
	// 단독 부분
	void load() {}   // 태운다(드랍쉽만의 고유한 기술)
	void unloade() {}// 내린다(드랍쉽만의 고유한 기술)
}
