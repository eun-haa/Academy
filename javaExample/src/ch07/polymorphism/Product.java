package ch07.polymorphism;

public class Product {// 자동으로 extends Object, 그 안에 toString이라는 내부 함수
	                  // 참조변수.toString 이렇게 내장되어있음
					  // => 거기에 해당되는 주소가 나오게됨;
	// 제품 가격을 저장하기 위한 변수
	int price;
	// 제품 구매시 제공하는 보너스 점수
	int bonusPoint;
	// 생성자
	Product(int price){// 3.super() 이용
		this.price=price;
		
		// 보너스 점수는 제품 가격의 10%
		bonusPoint=(int)(price/10.0);
	}
}
