package ch07.polymorphism;

public class Product2 {
	// 물건 가격을 담을 변수 선언
	int price;
	// 보너스 점수를 담을 변수 선언
	int bonusPoint;
	
	// 변수가 한개인(int price) 생성자 초기화
	Product2(int price){
		this.price=price;
		// this란?
		// 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있음
		// 인스턴스 변수와 지역변수를 구분하기 위해 참조변수 this 사용
		
		
		bonusPoint=(int)(price/10.0); // 보너스포인트는 가격에 10을 나눈 것인데 소수점 버리게 int로 형변환
	}
}
