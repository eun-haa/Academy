package ch06;

public class Calculator2Test {

	public static void main(String[] args) {
		//---------------------------
		// Ŭ���� �޼��� �ҷ�����(�׳� �ҷ����� ��)
		//---------------------------
		
		// Ŭ���� �޼��� - ���ϱ� ���
		System.out.println(Calculator2.multiply(100, 200));
		
		// Ŭ���� �޼��� - ������ ���
		System.out.println(Calculator2.divide(100, 200));
		
		
		
		//---------------------------
		// �ν��Ͻ� �޼��� �ҷ�����
		//---------------------------
		
		//�ν��Ͻ��� ����ϱ� ���� ����(new)
		Calculator2 c2 = new Calculator2(); 
		
		// �ν��Ͻ� �޼����� add, substract �ҷ�����
		System.out.println(c2.add(100, 200));
		System.out.println(c2.substract(100, 200));
		// Ŭ���� �޼���� ��ó�� �ҷ��;��ϴ°Ը�����, �ν��Ͻ�ó�� ȣ�⵵ ����
		System.out.println(c2.multiply(100, 200));
		System.out.println(c2.divide(100, 200));
	}

}
