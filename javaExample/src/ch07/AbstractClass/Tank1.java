package ch07.AbstractClass;
// 탱크는 정비공이 수리한다
public class Tank1 extends GroundUnit implements Repairable{
	Tank1(){
		super(150); //GroundUnit(파라미터){} 필수
	}
}
