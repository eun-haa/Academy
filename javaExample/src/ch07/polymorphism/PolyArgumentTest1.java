package ch07.polymorphism;

public class PolyArgumentTest1 {

	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		
		b.buy1(new Tv1());
		b.buy1(new Computer1());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint +"점 입니다.");

	}

}
