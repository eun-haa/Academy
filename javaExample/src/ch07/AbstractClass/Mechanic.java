package ch07.AbstractClass;
// ������� ������� �����Ѵ�
public class Mechanic extends GroundUnit implements Repairable{
	Mechanic(){
		super(60);
	}
	// �Ű������� �Ѱܹ��� ������ �����Ѵ�.
	void repair(Repairable r) {
		if(r instanceof Unit1) {
			System.out.println("������ �������ϴ�.");
		}
	}
}
