package ch07.polymorphism;

public class Product2 {
	// ���� ������ ���� ���� ����
	int price;
	// ���ʽ� ������ ���� ���� ����
	int bonusPoint;
	
	// ������ �Ѱ���(int price) ������ �ʱ�ȭ
	Product2(int price){
		this.price=price;
		// this��?
		// �ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ��� �ּҰ� ����Ǿ� ����
		// �ν��Ͻ� ������ ���������� �����ϱ� ���� �������� this ���
		
		
		bonusPoint=(int)(price/10.0); // ���ʽ�����Ʈ�� ���ݿ� 10�� ���� ���ε� �Ҽ��� ������ int�� ����ȯ
	}
}
