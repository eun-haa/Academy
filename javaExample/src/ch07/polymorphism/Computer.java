package ch07.polymorphism;

public class Computer extends Product{
	
//	Computer(int price){
//		this.price=price;
//		// this.price -> �θ����� ��ӹ��� price
//		// this -> Computer(int price)�� price!
//	}
	
	Computer(){
		super(200); // �θ�Ŭ������ �����ڸ� ����Ŵ (Product�� ���Ե�)
	}
	public String toString() {
		return "Computer";
	}
}
