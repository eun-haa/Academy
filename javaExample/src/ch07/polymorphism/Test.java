package ch07.polymorphism;

public class Test {
	public static void main(String[] args) {
		// 기존
//		Man m = new Man();
//		Woman w = new Woman();
//		
//		m.printInfo();
//		w.printInfo();
		
		//------------------------------
		// 다형성
		People p = new Man(); // 문법적으로 다형성
		p.printInfo();
		
		// 만약 enlist()와 makeUp()을 호출하고 싶다면?
		// 데이터 형에 맞게 캐스팅 해주어서 사용할 수 있음
		((Man)p).enlist();
		
		p = new Woman();      // 문법적으로 다형성
		p.printInfo();
		//p.enlist(); // People class에 없어서 호출 불가
		//p.makeUp(); // People class에 없어서 호출 불가
		
		// 만약 enlist()와 makeUp()을 호출하고 싶다면?
		// 데이터 형에 맞게 캐스팅 해주어서 사용할 수 있음
		((Woman)p).makeUp();

	}
}
