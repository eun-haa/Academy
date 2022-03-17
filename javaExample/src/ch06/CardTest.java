package ch06;

public class CardTest {

	public static void main(String[] args) {
		// 클래스 변수
		System.out.println("카드의 넓이 : " + Card.width); //클래스 변수 불러내기
		System.out.println("카드의 높이 : " + Card.height);//클래스 변수 불러내기
		
		// 인스턴스 변수
		// A클로버
		Card c1 = new Card();
		c1.kind="클로버";
		c1.number=1;
		// 2클로버
		Card c2 = new Card();
		c2.kind="클로버";
		c2.number=2;
		// 3클로버
		Card c3 = new Card();
		c3.kind="클로버";
		c3.number=3;
		
		System.out.println("c1의 종류는 "+c1.kind +", 숫자는"+c1.number+"이며, 크기는("+c1.width+", " +c1.height+")");
		System.out.println("c2의 종류는 "+c2.kind +", 숫자는"+c2.number+"이며, 크기는("+c2.width+", " +c2.height+")");
		System.out.println("c3의 종류는 "+c3.kind +", 숫자는"+c3.number+"이며, 크기는("+c3.width+", " +c3.height+")");
		
		c2.width=50;
		c2.height=50;
		
		// 클래스변수의 특징 : c2만 바꾸려고 했으나 전부 다 바뀜!
		System.out.println("c1의 종류는 "+c1.kind +", 숫자는"+c1.number+"이며, 크기는("+c1.width+", " +c1.height+")");
		System.out.println("c2의 종류는 "+c2.kind +", 숫자는"+c2.number+"이며, 크기는("+c2.width+", " +c2.height+")");
		System.out.println("c3의 종류는 "+c3.kind +", 숫자는"+c3.number+"이며, 크기는("+c3.width+", " +c3.height+")");
	}

}
