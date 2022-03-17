package ch07.polymorphism;

public class Man extends People{
	public void printInfo() {// 오버라이딩
		System.out.println("나는 남자 사람입니다.");
		
	}
	public void enlist() {
		System.out.println("군대를 갑니다.");
	}
}
