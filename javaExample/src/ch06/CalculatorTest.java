package ch06;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		// CalculatorTest�� Calculator ���԰���
		
		// 10(��Ģ����)20�� �ϱ����� ������ �޼ҵ� ȣ��
		System.out.println(c.add(10, 20)); //(c.add(10,20)����� ��ü�� 30!
		System.out.println(c.substract(10, 20));
		System.out.println(c.multiply(10, 20));
		System.out.println(c.divide(10, 20));
		
		// 10.5+20�� �ϱ� ���� add1 �޼��� ȣ��
		System.out.println(c.add(10.5, 20));
		
		// 10 + 20.5�� �ϱ� ���� add2 �޼��� ȣ��
		System.out.println(c.add(10, 20.5));
		
		// 10.5+20.5�� �ϱ� ���� add3 �޼��� ȣ��
		System.out.println(c.add(10.5, 20.5));
	}

}
