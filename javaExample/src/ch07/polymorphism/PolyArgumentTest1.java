package ch07.polymorphism;

public class PolyArgumentTest1 {

	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		
		b.buy1(new Tv1());
		b.buy1(new Computer1());
		
		System.out.println("���� ���� ���� " + b.money + "���� �Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + b.bonusPoint +"�� �Դϴ�.");

	}

}
