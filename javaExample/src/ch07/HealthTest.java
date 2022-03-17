package ch07;

public class HealthTest {

	public static void main(String[] args) {
		System.out.println("***** 비만도 Check *****");
		
		// 1.키보드로 입력받는 기능을 만들었고(설계), 최종으로 메인 메서드에 호출해야함!
		// 기능에서 끝나면 안됨
		// 2.void input()을 불러오기 위해서 인스턴스 생성을 해야함(인스턴스 클래스니까!)
		// + void input()은 본래 Health 클래스에 있었으나, SubHealth에 상속된상태
		// + 그래서 SubHealth만 불러와도 됨
		
		// 기본 생성자 호출(매개변수 없는 생성자를 이미 만들어놨고, 그걸 소환)
		SubHealth sh = new SubHealth();
		
		// (1) input() 호출
		// input()은 클래스 메소드가 아닌 인스턴스 메소드라서, 위의 sh를 이용해서 호출해야함
		// sh.input()은 키보드로 성별, 체중, 신장 입력받기
		sh.input();
		
		// (2) output1() 호출
		// input() 메소드를 이용하여 입력받은 값을 출력하는 메소드
		sh.output1();
		
		// (3) calculate() 호출
		// 비만도와 결과값을 구하는 메소드임
		sh.calculate();
		
		// (4) output2() 호출
		// calculate()를 이용하여 계산된 비만도와 결과값을 출력하는 메소드
		sh.output2();
		

	}

}
