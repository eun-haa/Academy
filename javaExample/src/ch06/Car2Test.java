package ch06;
//�����ڸ� �̿��� �ʱ�ȭ
public class Car2Test {

	public static void main(String[] args) {
		// �����ڸ� �̿��� �ʱ�ȭ
		Car2 c1 = new Car2("black", "auto",4);
		// �����ڸ� �̿��� �ʱ�ȭ
		Car2 c2 = new Car2("white", "auto",4);
		// �����ڸ� �̿��� �ʱ�ȭ
		Car2 c3 = new Car2("yellow", "auto",4);
		
		//System.out.println("c1 ���� ������ "+c1.color+"�̰�, ���Ÿ���� "+c1.gearType+"�̰�, ���� ������ " +c1.door);
		//System.out.println("c2 ���� ������ "+c2.color+"�̰�, ���Ÿ���� "+c2.gearType+"�̰�, ���� ������ " +c2.door);
		//System.out.println("c3 ���� ������ "+c3.color+"�̰�, ���Ÿ���� "+c3.gearType+"�̰�, ���� ������ " +c3.door);
		
		//-------------------------------------------------
		
		// �����ڿ��� �ٸ� ������ ȣ���ϱ� - this()
		Car2 c4 = new Car2();
		
		// �����ڸ� �̿��� �ν��Ͻ��� ����
		Car2 c5 = new Car2(c4);
		
		System.out.println("c4 ���� ������ "+c4.color+"�̰�, ���Ÿ���� "+c4.gearType+"�̰�, ���� ������ " +c4.door);
		System.out.println("c5 ���� ������ "+c5.color+"�̰�, ���Ÿ���� "+c5.gearType+"�̰�, ���� ������ " +c5.door);
	}

}
