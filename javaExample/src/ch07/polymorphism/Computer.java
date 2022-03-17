package ch07.polymorphism;

public class Computer extends Product{
	
//	Computer(int price){
//		this.price=price;
//		// this.price -> 부모한테 상속받은 price
//		// this -> Computer(int price)의 price!
//	}
	
	Computer(){
		super(200); // 부모클래스의 생성자를 가리킴 (Product로 가게됨)
	}
	public String toString() {
		return "Computer";
	}
}
