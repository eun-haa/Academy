package ch06;
// �����ڸ� �̿��� �ʱ�ȭ
public class Car2 {
	// ����
	String color;
	// ���ӱ� ���� - auto, manua1
	String gearType;
	// ���� ����
	int door;
	
	Car2(){ // �⺻������
		// �⺻�����ڿ��� �Ʒ��� Car2�� ȣ���ϰ� ��
		this("red", "manual", 4);
	}
	
	Car2(Car2 c){
		// �ϴ��� String color, String gearType, int door
		// �ּҸ� �̿��ؼ� ���� ������ �� ����
		this.color=c.color;
		this.gearType=c.gearType;
		this.door=c.door;
	}
	
	Car2(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}
