package ch07.AbstractClass;
// 정비공은 정비공이 수리한다
public class Mechanic extends GroundUnit implements Repairable{
	Mechanic(){
		super(60);
	}
	// 매개변수로 넘겨받은 유닛을 수리한다.
	void repair(Repairable r) {
		if(r instanceof Unit1) {
			System.out.println("수리가 끝났습니다.");
		}
	}
}
