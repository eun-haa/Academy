package ch07.polymorphism;

public class Product {// �ڵ����� extends Object, �� �ȿ� toString�̶�� ���� �Լ�
	                  // ��������.toString �̷��� ����Ǿ�����
					  // => �ű⿡ �ش�Ǵ� �ּҰ� �����Ե�;
	// ��ǰ ������ �����ϱ� ���� ����
	int price;
	// ��ǰ ���Ž� �����ϴ� ���ʽ� ����
	int bonusPoint;
	// ������
	Product(int price){// 3.super() �̿�
		this.price=price;
		
		// ���ʽ� ������ ��ǰ ������ 10%
		bonusPoint=(int)(price/10.0);
	}
}
