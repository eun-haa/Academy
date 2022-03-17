package javaExample;

public class DefaultConstructor {
	void HelloJava() {
		System.out.println("Hello Java!");
	}
	public static void main(String[] args) {
		// 디폴트 생성자의 사용
		DefaultConstructor dc = new DefaultConstructor();
		dc.HelloJava();
		
		
		// 출력 결과
		// Hello Java!
	}

}
