package ch07.polymorphism;

public class Tv extends Product{
	Tv(){ // 3. super() 이용한 초기화 방법(부모 클래스의 생성자를 호출)
		super(100); // Tv 가격(100)
	}
	public String toString() {// 기존에 있던 toString(내장)을 Tv라는 문자로 오버라이딩!
		return "Tv";		  // 그래서 콘솔에 Tv 구입하셨습니다. 가 출력됨
	}
	
//	Tv(int price){// 2.생성자를 이용한 초기화 방법
//		this.price=price;
//		// this price -> 상속받은 price(눈에는 안보이지만 상속받은)
//		// price = Tv(int price)의 price!
//	}
}
