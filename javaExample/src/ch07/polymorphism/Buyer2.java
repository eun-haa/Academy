package ch07.polymorphism;

public class Buyer2 {
	int account = 1000;
	int bonusPoint = 0;
	
	void buy2(Product2 p) {
		if(account < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		account -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p + "를 구입하셨습니다.");
	}
}
