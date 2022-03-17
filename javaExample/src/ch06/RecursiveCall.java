package ch06;

public class RecursiveCall {

	public static void main(String[] args) {
		int result=factorial(4); //만약 다른 클래스에서 이 함수를 호출했다면.
								 //factorial 앞에 RecursiveCall 붙여야함
		System.out.println(result);

	}// main 메소드 끝
	
	// factorial메소드 선언
	static int factorial(int n) {
		// factorial 결과를 저장하는 변수
		int result=0;
		if(n==1) {
			result=1;
		}else {
			result = n*factorial(n-1);
		}
		
		return result;
	}

}
