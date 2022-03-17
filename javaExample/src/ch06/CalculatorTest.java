package ch06;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		// CalculatorTest에 Calculator 포함관계
		
		// 10(사칙연산)20을 하기위해 각각의 메소드 호출
		System.out.println(c.add(10, 20)); //(c.add(10,20)결과값 자체가 30!
		System.out.println(c.substract(10, 20));
		System.out.println(c.multiply(10, 20));
		System.out.println(c.divide(10, 20));
		
		// 10.5+20을 하기 위해 add1 메서드 호출
		System.out.println(c.add(10.5, 20));
		
		// 10 + 20.5를 하기 위해 add2 메서드 호출
		System.out.println(c.add(10, 20.5));
		
		// 10.5+20.5를 하기 위해 add3 메서드 호출
		System.out.println(c.add(10.5, 20.5));
	}

}
