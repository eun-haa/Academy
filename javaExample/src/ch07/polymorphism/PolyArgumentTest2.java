package ch07.polymorphism;

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer2 b2 = new Buyer2();
		
		b2.buy2(new Tv2());
		b2.buy2(new Audio2());
		
		System.out.println("현재 잔액은 " + b2.account + "만원 입니다.");
		System.out.println("현재 보너스 점수는 " + b2.bonusPoint +"점 입니다.");
	}

}
