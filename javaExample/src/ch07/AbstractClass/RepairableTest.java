package ch07.AbstractClass;

public class RepairableTest {

	public static void main(String[] args) {
		Tank1 tank = new Tank1();// Tank
		Mechanic m = new Mechanic();// Mechanic
		Army a = new Army();// Army
		Airplane ap = new Airplane();// Airplane
		
		m.repair(tank);
		// MechanicŬ������ repair �޼��忡 tank�� �ּҸ� �μ��� �ѱ�
		m.repair(ap);
		// MechanicŬ������ repair �޼��忡 airplane�� �ּҸ� �μ��� �ѱ�
		
		//m.repair(a); // army���� implements Repairable ������ �׷��� ���� �߻�
		               // -> Army Ŭ������ Repairable �������̽��� �������� �ʾ����Ƿ�
		               // Mechanic Ŭ������ repair �޼����� �Ű������� ����� �� ����
		
		

	}

}
