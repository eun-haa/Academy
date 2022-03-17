package ch06;

public class MemberCall {
	
	//----------------------------------
	// 변수 대입(인스턴스, 클래스)
	//----------------------------------
	
	// 인스턴스 변수
	int iv=10; //int앞에 static이 없음 = 인스턴스 변수
	// 클래스 변수
	static int cv=20;
	
	// 인스턴스 변수 = 클래스 변수
	// 클래스 변수를 인스턴스 변수에 넣을 수 있나?(대입)
	// -> 현재 메모리에 먼저 올라가있는 것은 클래스 변수 cv
	int iv2=cv;
	// -> 그래서 cv는 iv에 대입 가능, 반대는 불가
	
	// 클래스 변수 = 인스턴스 변수
	// 인스턴스 변수를 클래스 변수에 넣을 수 있나?(대입)
	// 안되지만 그래도 넣으려면?
	static int cv2=new MemberCall().iv; // 이처럼 객체를 생성해야만 사용가능
	
	//----------------------------------
	// 메서드 안에 변수 호출(인스턴스, 클래스)
	//----------------------------------
	
	// 인스턴스메서드
	// new가 없어서 자바가 얘 존재를 모름
	void instanceMethod1() {
		System.out.println(iv); //인스턴스 변수 사용가능
		System.out.println(cv); //클래스 변수 사용가능
	}
	// 클래스메서드
	static void staticMethod1() {
		MemberCall m = new MemberCall();//이처럼 new객체 생성하면 가능
		System.out.println(m.iv); // iv(인스턴스 변수)는 현재 메모리에 없어서 안됨
		System.out.println(cv); //클래스 변수 사용가능
	}
	
	//----------------------------------
	// 메서드 안에 메서드 호출(인스턴스, 클래스)
	//----------------------------------
	
	// 인스턴스 메소드
	void instanceMethod2() {
		// 인스턴스 메소드 호출 -> 가능
		instanceMethod1();
		// 클래스 메소드 호출 -> 가능
		staticMethod1();
	}
	// 클래스 메소드
	static void staticMethod2() {
		// 인스턴스 메소드 호출 -> 불가능(그래도 하려면? new 객체 생성)
		MemberCall m = new MemberCall();
		m.instanceMethod1();
		// 클래스 메소드 호출 -> 가능
		staticMethod1();
	}
}
