package javaExample;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// 인스턴스 메서드니까 new 객체 생성 필수
		Calculator c = new Calculator();
		
		Scanner s = new Scanner(System.in);
		System.out.println("연산하고자 하는 두 정수값과 연산자를 입력하세요");
		int num1 = s.nextInt();
		String x = s.next();
		int num2 = s.nextInt();
		
		
		if(x.equals("+")) {
			System.out.println("연산결과는 " + c.getAdd(num1, num2)+"입니다.");
		}else if(x.equals("-")) {
			System.out.println("연산결과는 " + c.getSub(num1, num2)+"입니다.");
		}else if(x.equals("*")) {
			System.out.println("연산결과는 " + c.getMul(num1, num2)+"입니다.");
		}else if(x.equals("/")) {
			System.out.println("연산결과는 " + c.getDiv(num1, num2)+"입니다.");
		}else {
			System.out.println("다시 입력하세요.");
		}
		
//		System.out.println("연산결과는 " + c.getAdd(num1, num2)+"입니다.");
//		System.out.println("연산결과는 " + c.getSub(num1, num2)+"입니다.");
//		System.out.println("연산결과는 " + c.getMul(num1, num2)+"입니다.");
//		System.out.println("연산결과는 " + c.getDiv(num1, num2)+"입니다.");
	}

}
