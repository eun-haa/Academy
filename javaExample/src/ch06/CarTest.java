package ch06;
//�����  �ʱ�ȭ
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		
		// ����� �ʱ�ȭ
		c1.color="black";
		c1.gearType="auto";
		c1.door=4;
		
		
		Car c2 = new Car();
		
		// ����� �ʱ�ȭ
		c2.color="white";
		c2.gearType="auto";
		c2.door=4;
		
		
		Car c3 = new Car();
		
		// ����� �ʱ�ȭ
		c3.color="yellow";
		c3.gearType="auto";
		c3.door=4;
		
		
		System.out.println("c1 ���� ������ "+c1.color+"�̰�, "+ "���Ÿ���� "+c1.gearType+"�̰�, ���� ������ " +c1.door);
		System.out.println("c1 ���� ������ "+c2.color+"�̰�, "+ "���Ÿ���� "+c2.gearType+"�̰�, ���� ������ " +c2.door);
		System.out.println("c1 ���� ������ "+c3.color+"�̰�, "+ "���Ÿ���� "+c3.gearType+"�̰�, ���� ������ " +c3.door);

	}

}
