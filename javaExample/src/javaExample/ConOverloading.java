package javaExample;

public class ConOverloading {
	String name = "박부장";
	String address = "서울 중구";
	int age = 40;
	
	// 디폴트 생성자 재 정의
	public ConOverloading() {
		
	}
	
	// 매개변수가 있는 생성자의 사용
	public ConOverloading(String a, String b) {
		this.name = a;
		this.address = b;
	}
	
	// 매개변수가 있는 생성자의 사용
	public ConOverloading(String a, String b, int x) {
		this.name = a;
		this.address = b;
		this.age = x;
	}

}
