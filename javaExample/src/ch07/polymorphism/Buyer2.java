package ch07.polymorphism;

public class Buyer2 {
	int account = 1000;
	int bonusPoint = 0;
	
	void buy2(Product2 p) {
		if(account < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		
		account -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p + "�� �����ϼ̽��ϴ�.");
	}
}
