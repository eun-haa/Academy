package examPractice.ch07_exam;

import java.util.Scanner;

// 부모클래스
public class Health {
	// 성별을 담을 변수
	char gender;
	// 신장을 담을 변수
	double tall;
	// 체중을 담을 변수
	double weight;
	
	//------------------------------------
	// 생성자 초기화
	Health(){
		gender=' ';
		tall=0.0;
		weight=0.0;
	}
	
	//------------------------------------
	
	Scanner s = new Scanner(System.in);
	
	// input() - 성별, 신장, 제충을 입력받는 메소드
	void input() {
		System.out.print("성별(M/F) : ");
		gender=s.next().charAt(0);
		
		System.out.print("신장(Cm) : ");
		tall=s.nextDouble();
		
		System.out.print("체중(Kg) : ");
		weight=s.nextDouble();		
	}
	
	// output1() - 출력하는 메소드
	void output1() {
		System.out.println("성별 - " + gender);
		System.out.println("신장 - " + tall + "Cm");
		System.out.println("체중 - " + weight + "Kg");
	}
}
