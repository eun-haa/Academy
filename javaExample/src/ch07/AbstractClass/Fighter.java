package ch07.AbstractClass;
// 인터페이스는 상속과 구현이 동시에 가능하다
public class Fighter implements Fighterble{

	@Override
	public void move(int x, int y) {}

	@Override
	public void attack(Unit u) {}
	
	@Override
	void stop() {}
	
}
