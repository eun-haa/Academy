package ch07.polymorphism;

public class Woman extends People{
	public void printInfo() {// 오버라이딩
		System.out.println("나는 여자 사람입니다.");
	}
	public void makeUp() { // 오버라이딩 X
		System.out.println("단장을 합니다.");
	}
}
