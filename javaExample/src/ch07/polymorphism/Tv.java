package ch07.polymorphism;

public class Tv extends Product{
	Tv(){ // 3. super() �̿��� �ʱ�ȭ ���(�θ� Ŭ������ �����ڸ� ȣ��)
		super(100); // Tv ����(100)
	}
	public String toString() {// ������ �ִ� toString(����)�� Tv��� ���ڷ� �������̵�!
		return "Tv";		  // �׷��� �ֿܼ� Tv �����ϼ̽��ϴ�. �� ��µ�
	}
	
//	Tv(int price){// 2.�����ڸ� �̿��� �ʱ�ȭ ���
//		this.price=price;
//		// this price -> ��ӹ��� price(������ �Ⱥ������� ��ӹ���)
//		// price = Tv(int price)�� price!
//	}
}
