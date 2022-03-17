package examPractice;

import java.util.Scanner;

public class Health {
	// input에 입력받기 위해
	Scanner s = new Scanner(System.in);
	
	// 성별을 저장하기 위한 변수
	char gender;
	// 신장을 저장하기 위한 변수
	double tall;
	// 체중을 저장하기 위한 변수
	double weight;
	
	//-----------------------------------
	
	// 생성자(초기화)
	Health(){
		
	}
	
	//-----------------------------------
	
	// 성별,신장,체중을 입력받기(input)
	void input() {
		System.out.println("성별(M/F) : ");
		gender = s.next().charAt(0); //char 타입이 없기에 String 타입 선택한 후
		                             // .charAt(0) 붙여주기
		System.out.println("신장(Cm) : ");
		tall = s.nextDouble();
		
		System.out.println("체중(Kg) : ");
		weight = s.nextDouble();
	}
	// 출력(output)
	void output1() {
		System.out.println("성별 - " + gender);
		System.out.println("신장 - " + tall + "Cm");
		System.out.println("체중 - " + weight + "Kg");
	}
}
