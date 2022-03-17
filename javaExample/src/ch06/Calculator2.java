package ch06;

public class Calculator2 {
	// +(인스턴스 메서드 선언)
	int add(int num1, int num2) {
		return num1+num2;
	}
	// -(인스턴스 메서드 선언)
	int substract(int num1, int num2) {
		return num1-num2;
	}
	// *(클래스 메서드 선언)
	static int multiply(int num1, int num2) {
		return num1*num2;
	}
	// /(클래스 메서드 선언)
	// 나누기 소수점 표시하려면 형변환 필수 !
	static float divide(int num1, int num2) {
		return num1/(float)num2;
	}
}
