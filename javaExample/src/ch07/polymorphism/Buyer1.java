package ch07.polymorphism;

public class Buyer1 {
	int money=1000;
	int bonusPoint=0;
	
	void buy1(Product1 p1) {
		if(money < p1.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		money -= p1.price;
		bonusPoint += p1.bonusPoint;
		
		System.out.println(p1+"�� �����ϼ̽��ϴ�.");
	}
}
