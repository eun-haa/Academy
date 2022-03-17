package ch07.modifier;
// 오버라이딩
public class FinalTestEx extends FinalTest {
	// 빨간 줄이 사라지려면 FinalTest에 Final 키워드 삭제!
	// Final이 붙으면 상속될 수 없고, 아래처럼 오버라이딩도 불가능
	void getMaxSize() {
		System.out.println("final키워드가 없으면 변경가능");
	}
	
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		ft.MAX_SIZE=20; // 상수로 지정해둬서 변경 불가능
	}
}
