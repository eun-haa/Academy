package ch06;

public class Calculator2Test {

	public static void main(String[] args) {
		//---------------------------
		// 클래스 메서드 불러오기(그냥 불러오면 됨)
		//---------------------------
		
		// 클래스 메서드 - 곱하기 출력
		System.out.println(Calculator2.multiply(100, 200));
		
		// 클래스 메서드 - 나누기 출력
		System.out.println(Calculator2.divide(100, 200));
		
		
		
		//---------------------------
		// 인스턴스 메서드 불러오기
		//---------------------------
		
		//인스턴스를 사용하기 위해 생성(new)
		Calculator2 c2 = new Calculator2(); 
		
		// 인스턴스 메서드인 add, substract 불러오기
		System.out.println(c2.add(100, 200));
		System.out.println(c2.substract(100, 200));
		// 클래스 메서드는 위처럼 불러와야하는게맞지만, 인스턴스처럼 호출도 가능
		System.out.println(c2.multiply(100, 200));
		System.out.println(c2.divide(100, 200));
	}

}
