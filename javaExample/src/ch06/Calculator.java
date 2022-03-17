package ch06;
// 사칙연산 설계
public class Calculator {
	// + (10+20) 매개변수는 10, 20. return 있다.(타입은 int) 메소드 이름은 add
	int add(int firstNum, int secondNum) { //선언부
		//int result=firstNum+firstNum;
		//return result;
		return firstNum+secondNum;	
	}
	
	//            실수                 ,     정수
	double add(double firstNum, int secondNum) {
		return firstNum+secondNum;
	}
	
	//            정수                 ,     실수
	double add(int firstNum, double secondNum) {
		return firstNum+secondNum;
	}
	
	//            실수                 ,     실수
	double add(double firstNum, double secondNum) {
		return firstNum+secondNum;
	}
	
	//-------------------------------------------
	
	// -
	int substract(int firstNum, int secondNum) {
		//int result=firstNum-firstNum;
		//return result;
		return firstNum-secondNum;
	}
	
	//-------------------------------------------
	
	// *
	int multiply(int firstNum, int secondNum) {
		//int result=firstNum*firstNum;
		//return result;
		return firstNum*secondNum;
	}
	
	//-------------------------------------------
	
	// /
	float divide(int firstNum, int secondNum) {
		//int result=firstNum/firstNum;
		//return result;
		return firstNum/(float)secondNum;
	}
	
	int max(int a, int b){
		int result=0;
		if(a>b) { //a가 b보다 크면
			result=a;
		}else { //a가 b보다 작거나 같으면
			result=b;
		}
		return result;
	}

}
