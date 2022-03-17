package ch07.modifier;

public class FinalCardTest{

	public static void main(String[] args) {
		//Card c = new Card(); // 기본생성자가 없어서 에러.
		  					   // 에러 없애는 법?
		                       // 1.Card 클래스에 기본생성자 Card() 생성
							   // 2. new Card()에 변수 2개 넣어주기
		
		Card c = new Card(10,"Heart");
		// 생성자를 이용해서 상수에 초기화
		// 1.number라는 지역변수에는 10, kind에는 "Heart"가 들어가게됨
		// 2.number=NUMBER, kind=KIND 대입됨
		// 3.최종적으로 NUMBER, KIND에 초기화가 됨
	}

}
