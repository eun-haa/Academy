package ch07.AbstractClass;
// 비행기는 정비공이 수리한다
public class Airplane extends AirUnit implements Repairable{
	Airplane(){
		super(125);
	}
}
