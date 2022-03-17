package ch07.polymorphism;

public class Product1 {
	int price;
	int bonusPoint;
	
	Product1(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
}
