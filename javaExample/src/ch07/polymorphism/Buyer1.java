package ch07.polymorphism;

public class Buyer1 {
	int money=1000;
	int bonusPoint=0;
	
	void buy1(Product1 p1) {
		if(money < p1.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p1.price;
		bonusPoint += p1.bonusPoint;
		
		System.out.println(p1+"를 구입하셨습니다.");
	}
}
