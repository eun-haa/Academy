package ch06;
// 기본형 매개변수 예제
public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data(); // x라는 변수에 접근할 수 있음
		d.x=10; //d.x와 x는 다른 값을 가지고 있음(저장영역도 다름) d.x는 힙에 저장
		System.out.println("main() : " + d.x);
		
		// change메소드 호출
		change(d.x);
		System.out.println("After change(d.x) : ");
		System.out.println("main() : "+d.x);
		
	}// main 메소드 끝
	static void change(int x) { // 기본형 매개변수
		x=1000; //x는 콜스택에 저장
		System.out.println("change() : " +x);
	}

}
