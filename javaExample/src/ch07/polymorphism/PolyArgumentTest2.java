package ch07.polymorphism;

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer2 b2 = new Buyer2();
		
		b2.buy2(new Tv2());
		b2.buy2(new Audio2());
		
		System.out.println("���� �ܾ��� " + b2.account + "���� �Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + b2.bonusPoint +"�� �Դϴ�.");
	}

}
